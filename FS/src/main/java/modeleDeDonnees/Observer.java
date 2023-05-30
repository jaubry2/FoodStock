package modeleDeDonnees;

public interface Observer {
    
    /**
     * Méthode appelée lorsqu'un changement est notifié à l'observateur.
     * Cette méthode doit être implémentée par les classes qui souhaitent observer un sujet.
     */
    public void update();
    
}
