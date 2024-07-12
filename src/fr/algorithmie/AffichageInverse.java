package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args){

        int [] array = { 1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        System.out.println("les elements du tableau array :");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println("les elements du tableau array inversés :");
        for(int i=array.length-1; i>=0;i--){
            System.out.print(array[i]+"\t");
        }

        int [] arrayCopy = new int[array.length];
        for(int i=0;i<array.length;i++){
            arrayCopy[i] = array[i];
        }



    }
}
