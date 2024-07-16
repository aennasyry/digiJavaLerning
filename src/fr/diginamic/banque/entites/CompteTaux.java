package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double taux;
    public CompteTaux(String numCompte, double solde, double taux){
        super(numCompte,solde);
        this.taux=taux;
    }

    @Override
    public String toString() {
        return "CompteTaux{" + super.toString() +
                "taux=" + taux +
                '}';
    }
}
