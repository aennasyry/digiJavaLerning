package fr.diginamic.banque.entites;

public class Compte {
    private int numCompte;
    private int solde;

    public Compte(int numCompte, int solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public int getSolde() {
        return solde;
    }
}
