import java.util.ArrayList;

public class Table {
    ArrayList<Joueur> listeDesJoueurs = new ArrayList<>();
    JeuDeCarte paquetDeCarte;

    public void Jouer(int nbrJoueurs){
        paquetDeCarte = new JeuDeCarte();
        paquetDeCarte.melanger();
        for(int i=0; i<nbrJoueurs; i++){
            listeDesJoueurs.add(new Joueur());
            listeDesJoueurs.get(i).mainJoueur.addAll(paquetDeCarte.Distribuer(5));
        }
        System.out.println(listeDesJoueurs.toString());
        System.out.println(paquetDeCarte.paquet.toString());
    }

    public Table(){

    }
}
