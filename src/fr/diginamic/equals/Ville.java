package fr.diginamic.equals;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        Ville other = (Ville) o;
        return (this.nom.equals(other.getNom()) && this.nbHabitants == other.getNbHabitants());
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }
}
