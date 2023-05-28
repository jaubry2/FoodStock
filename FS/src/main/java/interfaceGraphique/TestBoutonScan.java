package interfaceGraphique;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TestBoutonScan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple Choix de Fichier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Ouvrir le Fichier");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File fichierChoisi = fileChooser.getSelectedFile();
                    String chemin = fichierChoisi.getAbsolutePath();
                    String extension = getFileExtension(chemin);

                    if (extension.equalsIgnoreCase("png")) {
                        System.out.println("Fichier sélectionné : " + chemin);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Type de fichier invalide. Veuillez sélectionner un fichier PNG.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }

    private static String getFileExtension(String filePath) {
        int indicePoint = filePath.lastIndexOf(".");
        if (indicePoint == -1) {
            return "";
        }
        return filePath.substring(indicePoint + 1);
    }
}
