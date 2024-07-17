package fr.diginamic.tri;

import java.util.Objects;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public int compareTo(Ville autre){
        if(this.nbHabitants < autre.nbHabitants)
            return -1;
        else if(this.nbHabitants > autre.nbHabitants)
            return 1;
        return 0;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        Ville other = (Ville) o;
        return ( Objects.equals(this.nom,other.getNom()) && this.nbHabitants == other.getNbHabitants());
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }

    public String getNom() {
        return nom;
    }
    

    public int getNbHabitants() {
        return nbHabitants;
    }



}
