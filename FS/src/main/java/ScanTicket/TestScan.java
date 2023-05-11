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

public class TestScan {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

    }

    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("C:\\Users\\Eliott\\Desktop\\Tess4J"); //Mettre le chemin vers le dossier Tess4J

            Mat image = Imgcodecs.imread("C:\\Users\\Eliott\\Desktop\\Tess4J\\ticket2.jpg"); //Mettre le chemin vers le fichier à scanner
            Mat processedImage = preprocessImage(image);

            String text = tesseract.doOCR(convertMatToBufferedImage(processedImage));

            //Enregistrement de l'image processed
            MatOfByte matOfByte = new MatOfByte();
            Imgcodecs.imencode(".png", processedImage, matOfByte);
            byte[] byteArray = matOfByte.toArray();

            File outputFile = new File("C:\\Users\\Eliott\\Desktop\\Tess4J\\ticket_processed.png");
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                fos.write(byteArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
            
            List<Item> items = extractItems(text);
            for (Item item : items) {
                System.out.println(item);
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
        Imgproc.threshold(grayImage, binaryImage, 0, 255, Imgproc.THRESH_BINARY_INV | Imgproc.THRESH_OTSU);

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
        mat.get(0, 0, bytes); // get all the pixels
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(bytes, 0, targetPixels, 0, bytes.length);

        return image;
    }

    private static List<Item> extractItems(String text) {
        List<Item> items = new ArrayList<>(); //permet de regrouper les informations du texte sous la forme (nom, quantité, prix)
        Pattern pattern = Pattern.compile("^(.+?)\\s+(\\d+)\\s+([\\d,.]+)$", Pattern.MULTILINE); //Recherche des patterns à l'aide d'une expression régulière
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
