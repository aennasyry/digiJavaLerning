package fr.diginamic.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
    public static void main(String[] args){

        List<String> liste1 = new ArrayList<String>();
        liste1.add("rouge");
        liste1.add("vert");
        liste1.add("orange");

        List<String> liste2 = new ArrayList<String>();
        liste1.add("blanc");
        liste1.add("bleu");
        liste1.add("orange");

        Iterator<String> iter1 = liste1.iterator();
        Iterator<String> iter2 = liste2.iterator();

        HashSet<String> liste3 = new HashSet<String>();

        while(iter1.hasNext() || iter2.hasNext()){
            if(iter1.hasNext())
                liste3.add(iter1.next());
            if(iter2.hasNext())
                liste3.add(iter2.next());
        }

        for(String elmt : liste3){
            System.out.println(elmt);
        }



    }
}
