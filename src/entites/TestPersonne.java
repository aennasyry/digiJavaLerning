package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale a1 = new AdressePostale(10,"haynakhil",30000,"fes");
        AdressePostale a2 = new AdressePostale(120,"atlas",3000,"fes");

        Personne alae = new Personne("ennasyry", "alae",a1);

        Personne issa = new Personne("ennasyry","issam",a2);



    }

}
