package fr.diginamic.chaines;

import java.sql.SQLOutput;

public class TestStringBuilder {

    public static void main(String[] args){

        long debut = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();

        for(int j=1;j<=100000;j++){
            builder.append(j);
        }
        String chaine = builder.toString();

        long fin = System.currentTimeMillis();

        System.out.println("temps écoulé en millisecondes (stringBuilder):" + (fin - debut));


        long debutS = System.currentTimeMillis();

        String chaineS ="";
        for(int j=1;j<=100000;j++){
            chaineS = chaineS + String.valueOf(j);
        }

        long finS = System.currentTimeMillis();

        System.out.println("temps écoulé en millisecondes (String) :" + (finS - debutS));

    }
}
