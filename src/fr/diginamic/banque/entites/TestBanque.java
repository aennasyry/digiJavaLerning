package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args){
        Compte c1 = new Compte("JHQKEHL", 53666565);
        System.out.println(c1);


    Compte [] tab = new Compte[2];
    tab[0] = new Compte("JHDLJCNBBB12",21315.5);
    tab[1] = new CompteTaux("KSDKHSLKDVHKLS", 543545.5 , 1.5);

    for(int i=0;i<2;i++){
        System.out.println(tab[i]);
    }
}}
