package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne alae = new Personne();
        alae.nom = "ennasyry";
        alae.prenom = "alae";
        alae.adresse = new AdressePostale();
        alae.adresse.numRue = 10;
        alae.adresse.libelleRue = "haynakhil";
        alae.adresse.codePostal = 30000;
        alae.adresse.ville = "fes";

        Personne issa = new Personne();
        issa.nom = "ennasyry";
        issa.prenom = "issam";
        issa.adresse = new AdressePostale();
        issa.adresse.numRue = 235;
        issa.adresse.libelleRue = "atlas";
        issa.adresse.codePostal = 30000;
        issa.adresse.ville = "fes";

    }

}
