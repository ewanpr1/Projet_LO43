/**
 * Carte GagnerPlutonium permet de gagner des ressouces de Plutonium
 */


package com.modele.cartes;

import com.modele.joueur.Joueur;
import com.modele.ressources.Ressources;

public class GagnerPlutonium implements Cartes {

    /**
     * Constructeur de la classe GagnerPlutonium
     */
    public GagnerPlutonium(){}

    /**
     * Action realise par la carte GagnerPlutonium
     * @param j Le joueur concerne
     */
    public void action(Joueur j) {
        j.ajouterRessources(Ressources.PLUTONIUM,1 + (int) (Math.random() * (4 - 1)));
        System.out.println("Joue GagnerPlutonium");
    }

}