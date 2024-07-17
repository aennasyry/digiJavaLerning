package fr.diginamic.list;
import java.util.*;


public class TestListString {
    public static void main(String[] args){
        List<String>  villes = new ArrayList<String>();
        villes.add("nice");
        villes.add("lyon");
        villes.add("pau");
        villes.add("tarbes");
        villes.add("carcassone");
        villes.add("narbone");
        villes.add("foix");
        villes.add("marseille");

        int s=0;
        String villeL = "";
        for(String v : villes){
            if(v.length() > s){
                s=v.length();
                villeL = v;
            }
        }

        System.out.println("La plus grande ville est " + villeL);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }


        for(String ville : villes)
            System.out.println(ville);


        Iterator<String> iter1 = villes.iterator();

        while (iter1.hasNext()){
            String ville = iter1.next();
            if (ville.startsWith("N")){
                iter1.remove();
            }
        }

        System.out.println("question 4");
        for(String ville : villes)
            System.out.println(ville);


    }
}
