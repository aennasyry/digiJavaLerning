package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args){

        String tab[] =  {"Paris", "Toulouse", "pau", "Le Havre", "Tarbes"};

        System.out.println("les cinq villes enregistrées sont : ");
        for(int i = 0; i<5; i++){
            System.out.print("\t"+tab[i]);
        }

        tab[2] = "Reims";

        System.out.println("\nAprès modification, les cinq villes enregistrées sont : ");
        for(int i = 0; i<5; i++){
            System.out.print("\t"+tab[i]);
        }
    }
}
