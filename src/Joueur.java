import java.util.ArrayList;

public class Joueur {
    ArrayList<Carte> mainJoueur = new ArrayList<>();

    public ArrayList<String> getMain(){
        int index = 0;
        ArrayList<String> indexSt = new ArrayList<>();
        ArrayList<String> couleurSt = new ArrayList<>();
        ArrayList<String> valeurSt = new ArrayList<>();

        for(int i=0; i<5; i++){
            indexSt.add(String.valueOf(index));
            couleurSt.add(mainJoueur.get(i).couleur.toString());
            valeurSt.add(mainJoueur.get(i).valeur.toString());
            index += 1;
        }

        System.out.println("Les cartes de la main sont :");
        System.out.println(indexSt);
        System.out.println(couleurSt);
        System.out.println(valeurSt);
        return null;
    }

    public Joueur(){

    }
}
