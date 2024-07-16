package fr.diginamic.banque.entites;

import java.sql.SQLOutput;

public class TestOperation {
    public static void main(String[] args){
        Operation [] tab = new Operation[4];

        tab[0] = new Credit("28/02/2024", 2500);
        tab[1] = new Credit("29/03/2024", 450);
        tab[2] = new Debit("30/03/2024", 25400);
        tab[3] = new Debit("28/04/2024", 25450);

        for(Operation elmt : tab){
            System.out.println(elmt);
        }
        double montantGlobal = 0;
        for(Operation elmt : tab){
            if(elmt.getType()=="Credit"){
                montantGlobal += elmt.getMontant();
            }
            else if(elmt.getType() == "Debit"){
                montantGlobal -= elmt.getMontant();
            }
        }

        System.out.println("le montant global est : " + montantGlobal);
    }


}
