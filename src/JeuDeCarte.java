import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCarte {
    ArrayList<Carte> paquet= new ArrayList<>();

    public ArrayList<Carte> GetPaquet(){
        //for(Carte carte:paquet) {
        //    return carte;
        //}
        //return null;
        return paquet;
    }

    public ArrayList<String> ListPaquet(){
        int index = 0;
        ArrayList<String> indexSt = new ArrayList<>();
        ArrayList<String> couleurSt = new ArrayList<>();
        ArrayList<String> valeurSt = new ArrayList<>();

        for(Carte carte:paquet){

            indexSt.add(String.valueOf(index));
            couleurSt.add(carte.couleur.toString());
            valeurSt.add(carte.valeur.toString());
            index += 1;

        }
        System.out.println(indexSt);
        System.out.println(couleurSt);
        System.out.println(valeurSt);
        return null;
    }

    public void melanger(){
        Collections.shuffle(paquet);
    }

    public Carte Piocher(){
        Carte carteADonner = paquet.getFirst();
        paquet.removeFirst();
        return carteADonner;
    }

    public ArrayList<Carte> Distribuer(int nbrCartes){
        ArrayList<Carte> cartesADonner = new ArrayList<>();
        for(int i=0; i<nbrCartes; i++){
            cartesADonner.add(paquet.getFirst());
            paquet.removeFirst();
        }
        return cartesADonner;
    }


    public JeuDeCarte(){
        for(CouleurCarteEnum couleur:CouleurCarteEnum.values()){
            for(ValeurCarteEnum valeur:ValeurCarteEnum.values()){
                paquet.add(new Carte(valeur, couleur));
            }
        }
    }
}
