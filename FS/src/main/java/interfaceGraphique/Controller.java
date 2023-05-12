/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGraphique;
/**
 *
 * @author julesa
 */
public class Controller {
    
    public void OuvrirPage(javax.swing.JFrame _page){
        _page.setVisible(true);
    }
    public void ChangerPage(String _page, String _erreur, String _message, String _nomAliment){
        javax.swing.JFrame newPage;
        switch(_page){
             
            case "accueil" : {
                newPage = new Accueil();
                OuvrirPage(newPage);
            }
            
            case "ajouterAliment" : {
                newPage = new AjouterAliment();
                OuvrirPage(newPage);
            }
            
            case "fenetreErreur" : {
                newPage = new FenetreErreur(_erreur, _message);
                OuvrirPage(newPage);
            }
            
            case "ficheAliment" : {
                newPage = new FicheAliment(_nomAliment);
                OuvrirPage(newPage);
            }
            
            case "menuListe" : {
                newPage = new MenuListe();
                OuvrirPage(newPage);
            }
            
            case "menuRecette" : {
                newPage = new MenuRecette();
                OuvrirPage(newPage);
            }
            
            case "menuStock" : {
                newPage = new MenuStock();
                OuvrirPage(newPage);
            }
            
            case "modifierUnAliment" : {
                newPage = new ModifierUnAliment();
                OuvrirPage(newPage);
            }
            
            default : {
                //Erreur
            }
        }
    }
        

        
}
