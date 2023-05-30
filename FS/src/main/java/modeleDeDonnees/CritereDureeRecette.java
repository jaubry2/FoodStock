package modeleDeDonnees;

/**
 * Enumération représentant les différentes durées des recettes.
 * Les types d'aliments possibles sont : Rapide, Medium et Long.
 */
public enum CritereDureeRecette {
    RAPIDE() {
        /**
         * Vérifie si la valeur donnée est dans la plage pour le critère RAPIDE.
         *
         * @param valeur la valeur à vérifier
         * @return true si la valeur est inférieure à 15, sinon false
         */
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur < 15;
        }
    },
    MEDIUM() {
        /**
         * Vérifie si la valeur donnée est dans la plage pour le critère MEDIUM.
         *
         * @param valeur la valeur à vérifier
         * @return true si la valeur est comprise entre 15 et 30 (inclus), sinon false
         */
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur >= 15 && valeur <= 30;
        }
    },
    LONG() {
        /**
         * Vérifie si la valeur donnée est dans la plage pour le critère LONG.
         *
         * @param valeur la valeur à vérifier
         * @return true si la valeur est supérieure à 30, sinon false
         */
        @Override
        public boolean estDansLaPlage(int valeur) {
            return valeur > 30;
        }
    };

    /**
     * Vérifie si la valeur donnée est dans la plage correspondant au critère.
     *
     * @param valeur la valeur à vérifier
     * @return true si la valeur est dans la plage, sinon false
     */
    public abstract boolean estDansLaPlage(int valeur);
}
