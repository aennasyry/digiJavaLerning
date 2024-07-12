package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args){

        System.out.println("les nombres de 1 à 10 : ");
        for(int i=1; i<=10; i++){
            System.out.print(i+"\t");
        }

        System.out.println("\nles nombres pairs de 0 à 10 : ");
        for(int i=0; i<=10; i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        }

        System.out.println("\nles nombres impairs de 0 à 9 : ");
        for(int i=0; i<=10; i++){
            if(i%2!=0){
                System.out.print(i+"\t");
            }
        }

        System.out.println("\nles nombres de 1 à 10 : ");
        int i=1;
        while(i<=10){
            System.out.print(i+"\t");
            i++;
        }

        System.out.println("\nles nombres pairs de 0 à 10 : ");
        int j=1;
        while(j<=10){
            if(j%2==0){
                System.out.print(j+"\t");
            }

            j++;
        }

        System.out.println("\nles nombres impairs de 0 à 9 : ");
        int k=1;
        while(k<=10){
            if(k%2!=0){
                System.out.print(k+"\t");
            }

            k++;
        }
    }
}
