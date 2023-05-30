package modeleDeDonnees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import baseDeDonnees.AlimentService;

/**
 * Classe représentant le stock d'aliments.
 */
public class Stock {

    // La liste d'aliments stockés qui contient tous les emplacements et les aliments stockés dans chaque emplacement
    private List<AlimentStockes> stock;

    /**
     * Constructeur qui initialise le stock.
     *
     * @param stock la liste d'aliments stockés initiale
     */
    public Stock(List<AlimentStockes> stock) {
        this.stock = stock;
    }

    /**
     * Constructeur par défaut qui crée un stock vide.
     */
    public Stock() {
        this.stock = new ArrayList<>();
    }

    /**
     * Retourne la liste des aliments stockés.
     *
     * @return la liste des aliments stockés
     */
    public List<AlimentStockes> getStock() {
        return stock;
    }

    /**
     * Définit la liste des aliments stockés.
     *
     * @param stock la liste des aliments stockés
     */
    public void setStock(List<AlimentStockes> stock) {
        this.stock = stock;
    }

    /**
     * Retourne une liste filtrée des aliments stockés correspondant à un type d'aliment donné.
     *
     * @param typeAliment le type d'aliment à filtrer
     * @return une liste des aliments stockés correspondant au type d'aliment donné
     */
    public List<AlimentStockes> filtrerType(TypeAliment typeAliment) {
        List<AlimentStockes> listStockFiltre = new ArrayList<>();
        for (AlimentStockes alimentsStock : stock) {
            if (alimentsStock.getAliment().getTypeAliment() == typeAliment) {
                listStockFiltre.add(alimentsStock);
            }
        }
        return listStockFiltre;
    }

    /**
     * Filtre les objets AlimentStockes d'un stock ayant une date de péremption proche
     * selon la durée spécifiée.
     *
     * @param duree la durée en jours pour laquelle les objets AlimentStockes sont considérés comme proches de leur date de péremption
     * @return une liste des objets AlimentStockes dont la date de péremption est proche
     */
    public List<AlimentStockes> filtrerDate(int duree) {
        List<AlimentStockes> listStockFiltre = new ArrayList<>();
        for (AlimentStockes alimentStock : stock) {
            if (alimentStock.getDatePeremption().minusDays(duree).isBefore(LocalDate.now())) {
                listStockFiltre.add(alimentStock);
            }
        }
        return listStockFiltre;
    }

    /**
     * Ajoute un aliment stocké dans un emplacement du stock à partir de l'objet AlimentStockes.
     *
     * @param alimentsStock l'aliment à ajouter dans l'emplacement
     */
    public void ajouterAliment(AlimentStockes alimentsStock) {
        stock.add(alimentsStock);
    }

    /**
     * Ajoute un aliment stocké à partir de l'aliment, de la quantité et de la date de péremption.
     *
     * @param aliment         l'aliment à ajouter dans l'emplacement
     * @param quantite        la quantité de l'aliment à ajouter
     * @param datePeremption  la date de péremption de l'aliment à ajouter
     */
    public void ajouterAliment(Aliment aliment, float quantite, LocalDate datePeremption) {
        AlimentStockes alimentsStock = new AlimentStockes(aliment, quantite, datePeremption);
        ajouterAliment(alimentsStock);
    }

    /**
     * Ajoute une liste d'aliments stockés dans le stock.
     *
     * @param listAjout la liste d'aliments stockés à ajouter
     */
    public void ajouterListe(List<AlimentStockes> listAjout) {
        stock.addAll(listAjout);
    }

    /**
     * Retire un aliment stocké du stock.
     *
     * @param alimentsStock l'aliment stocké à retirer du stock
     */
    public void retirerAliment(AlimentStockes alimentsStock) {
        stock.remove(alimentsStock);
    }

    /**
     * Affiche le contenu de tous les stocks de nourriture.
     * La sortie est sous la forme :
     * "Contenu du stock :
     * Stock :
     * - <nomAliment> (<quantite><uniteMesure>)<datePeremption>"
     */
    public void afficherContenuStock() {
        System.out.println("Contenu du stock :");
        System.out.println("Stock :");
        for (AlimentStockes alimentsStock : stock) {
            System.out.println("- " + alimentsStock.getAliment().getNom() + " (" + alimentsStock.getQuantite() + alimentsStock.getAliment().getUniteMesure() + ")" + alimentsStock.getDatePeremption());
        }
    }

    /**
     * Cherche un objet Aliment dans une liste d'objets Aliment en fonction du nom de l'aliment.
     *
     * @param listAliments la liste d'objets Aliment dans laquelle chercher
     * @param nom          le nom de l'aliment recherché
     * @return l'objet Aliment correspondant au nom de l'aliment recherché, ou null si l'aliment n'est pas trouvé
     * @throws AlimentsNonPresentException si l'aliment n'est pas présent dans la liste
     */
    public static Aliment getAlimentByName(List<Aliment> listAliments, String nom) {
        for (Aliment aliment : listAliments) {
            if (aliment.getNom().equals(nom)) {
                return aliment;
            }
        }
        throw new AlimentsNonPresentException(nom);
    }

    /**
     * Vérifie si un aliment stocké est présent dans le stock en fonction du nom de l'aliment.
     *
     * @param nomAliment le nom de l'aliment recherché
     * @return true si l'aliment est présent dans le stock, sinon false
     */
    public boolean isAlimentStockesByName(String nomAliment) {
        for (AlimentStockes alimentStockes : stock) {
            if (alimentStockes.getAliment().getNom().equals(nomAliment)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retourne l'objet AlimentStockes correspondant au nom de l'aliment recherché.
     *
     * @param nomAliment le nom de l'aliment recherché
     * @return l'objet AlimentStockes correspondant au nom de l'aliment recherché
     * @throws AlimentsNonPresentException si l'aliment n'est pas présent dans le stock
     */
    public AlimentStockes getAlimentStockesByName(String nomAliment) {
        for (AlimentStockes alimentStockes : stock) {
            if (alimentStockes.getAliment().getNom().equals(nomAliment)) {
                return alimentStockes;
            }
        }
        throw new AlimentsNonPresentException(nomAliment);
    }

    /**
     * Retire une quantité spécifiée d'un aliment stocké du stock.
     * La quantité est retirée des aliments dans l'ordre des dates de péremption croissantes.
     * Si la quantité demandée est supérieure à la quantité totale disponible, plusieurs aliments peuvent être retirés.
     *
     * @param nomAliment le nom de l'aliment à retirer
     * @param quantite   la quantité à retirer
     */
    public void retirerQuantiteStock(String nomAliment, float quantite) {
        List<AlimentStockes> listAlimentSupp = new ArrayList<>();
        for (AlimentStockes alimentStockes : stock) {
            if (alimentStockes.getAliment().getNom().equals(nomAliment)) {
                listAlimentSupp.add(alimentStockes);
            }
        }
        // Tri de la liste par date de péremption
        listAlimentSupp.sort(Comparator.comparing(AlimentStockes::getDatePeremption));
        int i = 0;
        while (quantite > 0 && i < listAlimentSupp.size()) {
            AlimentStockes alimentStock = listAlimentSupp.get(i);
            float quantiteAliment = alimentStock.getQuantite();
            quantiteAliment = quantiteAliment - quantite;
            if (quantiteAliment <= 0) {
                this.retirerAliment(alimentStock);
                quantite = Math.abs(quantiteAliment);
            } else {
                listAlimentSupp.get(i).setQuantite(quantiteAliment);
                quantite = 0;
            }
            i++;
        }
    }

    /**
     * Retourne la quantité d'un aliment stocké non périmé.
     *
     * @param nomAliment le nom de l'aliment recherché
     * @return la quantité de l'aliment stocké non périmé
     */
    public float getQuantiteASNonPerime(String nomAliment) {
        float quantite = 0;
        for (AlimentStockes alimentStockes : stock) {
            if (alimentStockes.getAliment().getNom().equals(nomAliment)) {
                if (alimentStockes.getDatePeremption().isAfter(LocalDate.now())) {
                    quantite += alimentStockes.getQuantite();
                }
            }
        }
        return quantite;
    }

    /**
     * Retourne la quantité totale d'un aliment stocké, qu'il soit périmé ou non.
     *
     * @param nomAliment le nom de l'aliment recherché
     * @return la quantité totale de l'aliment stocké
     */
    public float getQuantiteAS(String nomAliment) {
        float quantite = 0;
        for (AlimentStockes alimentStockes : stock) {
            if (alimentStockes.getAliment().getNom().equals(nomAliment)) {
                quantite += alimentStockes.getQuantite();
            }
        }
        return quantite;
    }
}
