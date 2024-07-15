package entites;

public class TestAdressePostale {

    public static void main (String[] args){
        AdressePostale a1 = new AdressePostale();
        a1.numRue = 2;
        a1.libelleRue = "lattre";
        a1.codePostal = 65000;
        a1.ville = "Tarbes";
        AdressePostale a2 = new AdressePostale();
        a2.numRue = 123;
        a2.libelleRue = "Eden park";
        a2.codePostal = 65000;
        a2.ville = "Tarbes";

    }
}
