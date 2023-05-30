package modeleDeDonnees;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers = new ArrayList<Observer>();

    /**
     * Ajoute un observateur à la liste des observateurs.
     *
     * @param obs l'observateur à ajouter
     */
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    /**
     * Notifie tous les observateurs en appelant leur méthode update().
     */
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

}
