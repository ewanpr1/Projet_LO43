import com.graphique.FenetreLancement;
import com.modele.GameController;
import com.modele.ressources.Ressources;
import com.modele.joueur.Joueur;

import com.graphique.Fenetre;

public class Main {
    public static void main(String[] args) {

        /*FenetreLancement F = new FenetreLancement();
        F.setVisible(true);*/
        Joueur j1 = new Joueur("aa");
        Joueur j2 = new Joueur("aa");
        Joueur j3 = new Joueur("aa");
        Joueur j4 = new Joueur("aa");

        Fenetre f= new Fenetre(j1,j2,j3,j4);
        f.setVisible(true);

        System.out.println(" ------------------------------");

        /*GameController gc = new GameController();
        System.out.println(gc.toString());*/


    }
}
