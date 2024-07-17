package fr.diginamic.tri;
import java.util.*;
public class TestTri {
    public static void main(String[] args){

        ArrayList<Ville> villes= new ArrayList<Ville>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassone", 3453000));
        villes.add(new Ville("Narbone", 34000));
        villes.add(new Ville("Pau", 3421300));
        villes.add(new Ville("Toulouse", 3430));
        villes.add(new Ville("Marseille", 344000));
        villes.add(new Ville("Tarbes", 653000));
        villes.add(new Ville("Lyon", 656000));

        Collections.sort(villes);

        for(Ville ville : villes){
            System.out.println(ville);
        }


    }

}
