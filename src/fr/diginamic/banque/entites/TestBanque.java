package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args){
        Compte c1 = new Compte(54212, 53666565);
        System.out.println("le compte numero : " + c1.getNumCompte() + " a le solde : " + c1.getSolde());
    }
}
