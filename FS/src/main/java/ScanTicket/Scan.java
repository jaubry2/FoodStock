package ScanTicket;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.highgui.HighGui;

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

    public void scan(String pathImage) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("src/main/java/ScanTicket"); // Spécifie le chemin vers le dossier Tess4J

            Mat image = Imgcodecs.imread(pathImage); // Spécifie le chemin vers le fichier à scanner
            Mat imageTraitee = pretraiterImage(image);
            
            // Appliquer la détection de contours
            Mat contours = new Mat();
            Imgproc.Canny(imageTraitee, contours, 50, 150, 3, false);

            // Trouver les contours et plus particulièrement le contour le plus grand
            MatOfPoint plusGrandContour = trouverPlusGrandContour(contours);
            if (plusGrandContour != null) {
                // Approximer le polygone du contour
                MatOfPoint2f approxPoly = new MatOfPoint2f();
                MatOfPoint2f contour2f = new MatOfPoint2f(plusGrandContour.toArray());
                double epsilon = 0.02 * Imgproc.arcLength(contour2f, true);
                Imgproc.approxPolyDP(contour2f, approxPoly, epsilon, true);

                Mat imageContours = image.clone();
                Imgproc.drawContours(imageContours, List.of(plusGrandContour), 0, new Scalar(0, 255, 0), 2);
                dessinerPolygoneApproxime(imageContours, approxPoly);

                // Afficher l'image avec les contours et le polygone approximé
                HighGui.imshow("Image avec contours et polygone", imageContours);
                HighGui.waitKey(0);

                // Vérifier si le polygone est un rectangle
                if (approxPoly.total() == 4) {
                    // Redresser l'image
                    Mat imageCorrigee = corrigerPerspective(image, approxPoly);
                    String texte = tesseract.doOCR(convertirMatEnBufferedImage(imageCorrigee));
                    texte.replaceAll("\n", "");
                    System.out.println(texte);

                    // Enregistrer l'image traitée
                    MatOfByte matOfByte = new MatOfByte();
                    Imgcodecs.imencode(".png", imageCorrigee, matOfByte);
                    byte[] byteArray = matOfByte.toArray();

                    File outputFile = new File("src/main/java/ScanTicket/ticket_traite.png");
                    try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                        fos.write(byteArray);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    List<Article> articles = extraireArticles(texte);
                    for (Article article : articles) {
                        System.out.println(article);
                    }
                }
            }
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
    
    private static void dessinerPolygoneApproxime(Mat image, MatOfPoint2f approxPoly) {
        Point[] points = approxPoly.toArray();
        for (int i = 0; i < points.length; i++) {
            Imgproc.line(image, points[i], points[(i + 1) % points.length], new Scalar(255, 0, 0), 2);
        }
    }

    private static Mat pretraiterImage(Mat image) {
        Mat imageGrise = new Mat();
        Mat imageBinaire = new Mat();
        Mat imageDebruitee = new Mat();

        // Convertir l'image en niveaux de gris
        Imgproc.cvtColor(image, imageGrise, Imgproc.COLOR_BGR2GRAY);

        // Binarisation de l'image
        Imgproc.adaptiveThreshold(imageGrise, imageBinaire, 255, Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, Imgproc.THRESH_BINARY, 61, 10);

        // Réduction du bruit de l'image
        Imgproc.medianBlur(imageBinaire, imageDebruitee, 3);

        // Enregistrer l'image prétraitée
        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".png", imageDebruitee, matOfByte);
        byte[] byteArray = matOfByte.toArray();

        File outputFile = new File("src/main/java/ScanTicket/ticket_pretraite.png");
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return imageDebruitee;
    }

    private static BufferedImage convertirMatEnBufferedImage(Mat mat) {
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

    private static MatOfPoint trouverPlusGrandContour(Mat image) {
        MatOfPoint plusGrandContour = null;
        Mat hierarchy = new Mat();
        List<MatOfPoint> contours = new ArrayList<>();
        Imgproc.findContours(image, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

        double aireMax = 0;
        for (MatOfPoint contour : contours) {
            double aire = Imgproc.contourArea(contour);
            if (aire > aireMax) {
                aireMax = aire;
                plusGrandContour = contour;
            }
        }

        return plusGrandContour;
    }

    private static Mat corrigerPerspective(Mat image, MatOfPoint2f approxPoly) {
        // Définir les dimensions de l'image redressée
        float largeurImage = 500;
        float hauteurImage = 700;
        Mat imageCorrigee = new Mat(new Size(largeurImage, hauteurImage), image.type());

        // Définir les points de destination de l'image redressée
        MatOfPoint2f pointsDest = new MatOfPoint2f(
                new Point(0, 0), new Point(0, hauteurImage - 1),
                new Point(largeurImage - 1, hauteurImage - 1), new Point(largeurImage - 1, 0));

        // Calculer la matrice de transformation
        Mat matricePerspective = Imgproc.getPerspectiveTransform(approxPoly, pointsDest);

        // Appliquer la transformation perspective
        Imgproc.warpPerspective(image, imageCorrigee, matricePerspective, imageCorrigee.size(),
                Imgproc.INTER_LINEAR, Core.BORDER_CONSTANT, new Scalar(255, 255, 255));

        return imageCorrigee;
    }

    private static List<Article> extraireArticles(String texte) {
        List<Article> articles = new ArrayList<>();
        Pattern pattern = Pattern.compile("([^\\d]+)\\s(\\d+)\\s([\\d,\\.]+)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(texte);
        while (matcher.find()) {
            String nom = matcher.group(1);
            int quantite = Integer.parseInt(matcher.group(2));
            double prix = Double.parseDouble(matcher.group(3).replace(',', '.'));

            articles.add(new Article(nom, quantite, prix));
        }

        return articles;
    }

    static class Article {
        String nom;
        int quantite;
        double prix;

        public Article(String nom, int quantite, double prix) {
            this.nom = nom;
            this.quantite = quantite;
            this.prix = prix;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "nom='" + nom + '\'' +
                    ", quantite=" + quantite +
                    ", prix=" + prix +
                    '}';
        }
    }
}
