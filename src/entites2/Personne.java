package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                 adresse.toString() +
                '}';
    }

    public void afficherNomPrenom(){
        System.out.println("Nom : "+this.nom.toUpperCase() + "prenom : " + this.prenom);
    }

    public void modifierNom(String nom){
        this.nom = nom;
    }
    public void modifierPrenom(String prenom){
        this.prenom = prenom;
    }
    public void modifierAdresse(AdressePostale adresse){
        this.adresse = adresse;
    }

    public String returnNom(){
        return this.nom;
    }
    public String returnPrenom(){
        return this.prenom;
    }
    public AdressePostale returnAdresse(){
        return this.adresse;
    }


}
