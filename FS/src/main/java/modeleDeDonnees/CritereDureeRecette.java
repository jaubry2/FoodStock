package modeleDeDonnees;

/**
 * Enumération représentant les différentes durées des recettes.
 * Les types d'aliments possibles sont : Rapide, Medium et Long.
 */
public enum CritereDureeRecette {
    RAPIDE() {
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur < 15;
        }
    },
    MEDIUM() {
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur >= 15 && valeur <= 30;
        }
    },
    LONG() {
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur > 30;
        }
    };

    public abstract boolean estDansLaPlage(int valeur);
}
