package entites;

public class AdressePostale {
    int numRue;
    String libelleRue;
    int codePostal;
    String ville;

    public AdressePostale(int numRue, String libelleRue, int codePostal, String ville) {
        this.numRue = numRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

}
