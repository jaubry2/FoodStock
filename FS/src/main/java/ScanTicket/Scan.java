package ScanTicket;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Scan {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {

            tesseract.setDatapath("src/main/java/ScanTicket"); //Mettre le chemin vers le dossier Tess4J

            Mat image = Imgcodecs.imread("src/main/java/ScanTicket/ticket5.jpg"); //Mettre le chemin vers le fichier à scanner
            Mat processedImage = preprocessImage(image);
            
            // Appliquer une détection de contours
            Mat edges = new Mat();
            Imgproc.Canny(processedImage, edges, 50, 150, 3, false);

            // Trouver les contours
            MatOfPoint largestContour = findLargestContour(edges);
            if (largestContour != null) {
                // Approximer le polygone du contour
                MatOfPoint2f approxCurve = new MatOfPoint2f();
                MatOfPoint2f contour2f = new MatOfPoint2f(largestContour.toArray());
                double epsilon = 0.02 * Imgproc.arcLength(contour2f, true);
                Imgproc.approxPolyDP(contour2f, approxCurve, epsilon, true);

                // Vérifier si le polygone est un rectangle
                if (approxCurve.total() == 4) {
                	System.out.println("mskjdh");
                    // Redresser l'image
                    Mat correctedImage = correctPerspective(image, approxCurve);
                    String text = tesseract.doOCR(convertMatToBufferedImage(correctedImage));
                    text.replaceAll("\n", "");
                    System.out.println(text);
                    //Enregistrement de l'image processed
                    MatOfByte matOfByte = new MatOfByte();
                    Imgcodecs.imencode(".png", correctedImage, matOfByte);
                    byte[] byteArray = matOfByte.toArray();

                    File outputFile = new File("src/main/java/ScanTicket/ticket_processed.png");
                    try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                        fos.write(byteArray);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    
                    
                    List<Item> items = extractItems(text);
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }
            }



        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

    private static Mat preprocessImage(Mat image) {
        Mat grayImage = new Mat();
        Mat binaryImage = new Mat();
        Mat denoisedImage = new Mat();

        // Convertit l'image en nuances de gris
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Binarisation de l'image
        Imgproc.adaptiveThreshold(grayImage, binaryImage, 255, Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, Imgproc.THRESH_BINARY, 61, 10);

        // Debruitage de l'image
        Imgproc.medianBlur(binaryImage, denoisedImage, 3);

        return denoisedImage;
    }

    private static BufferedImage convertMatToBufferedImage(Mat mat) { //Conversion nécessaire pour réaliser l'OCR
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (mat.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = mat.channels() * mat.cols() * mat.rows();
        byte[] bytes = new byte[bufferSize];
        mat.get(0, 0, bytes);
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(bytes, 0, targetPixels, 0, bytes.length);

        return image;
    }
    
    private static MatOfPoint findLargestContour(Mat image) {
        MatOfPoint largestContour = null;
        Mat hierarchy = new Mat();
        List<MatOfPoint> contours = new ArrayList<>();
        Imgproc.findContours(image, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

        double maxArea = 0;
        for (MatOfPoint contour : contours) {
            double area = Imgproc.contourArea(contour);
            if (area > maxArea) {
                maxArea = area;
                largestContour = contour;
            }
        }

        return largestContour;
    }

    private static Mat correctPerspective(Mat image, MatOfPoint2f approxCurve) {
        // Définir les dimensions de l'image redressée
        float imageWidth = 500;
        float imageHeight = 700;
        Mat correctedImage = new Mat(new Size(imageWidth, imageHeight), image.type());

        // Définir les points de destination de l'image redressée
        MatOfPoint2f dstPoints = new MatOfPoint2f(new Point(0, 0), new Point(imageWidth - 1, 0),
                new Point(imageWidth - 1, imageHeight - 1), new Point(0, imageHeight - 1));

        // Calculer la matrice de transformation
        Mat perspectiveTransform = Imgproc.getPerspectiveTransform(approxCurve, dstPoints);

        // Appliquer la transformation perspective
        Imgproc.warpPerspective(image, correctedImage, perspectiveTransform, correctedImage.size(),
                Imgproc.INTER_LINEAR, Core.BORDER_CONSTANT, new Scalar(255, 255, 255));

        return correctedImage;
    }

    private static List<Item> extractItems(String text) {
        List<Item> items = new ArrayList<>(); //permet de regrouper les informations du texte sous la forme (nom, quantité, prix)
        Pattern pattern = Pattern.compile("([^\\d]+)\\s(\\d+)\\s([\\d,\\.]+)", Pattern.MULTILINE); //Recherche des patterns à l'aide d'une expression régulière
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String name = matcher.group(1);
            int quantity = Integer.parseInt(matcher.group(2));
            double price = Double.parseDouble(matcher.group(3).replace(',', '.'));

            items.add(new Item(name, quantity, price));
        }

        return items;
    }

    static class Item {
        String name;
        int quantity;
        double price;

        public Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}';
        }
    }
}