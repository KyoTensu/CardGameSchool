import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class JeuDeCarte {
    ArrayList<Carte> paquet= new ArrayList<>();

    public Carte GetPaquet(){
        for(Carte carte:paquet){
            return carte;
        }
    }
    public void melanger(){
        Collections.shuffle(paquet);
    }

    //public Carte Piocher(ValeurCarteEnum valeur, CouleurCarteEnum couleur){}
    public JeuDeCarte(){
        for(CouleurCarteEnum couleur:CouleurCarteEnum.values()){
            for(ValeurCarteEnum valeur:ValeurCarteEnum.values()){
                paquet.add(new Carte(valeur, couleur));
            }
        }
    }
}
