public class Cheval {
    public int nbPattes;
    private String nomCheval;

    private String couleur;

    private double taille;

    public Cheval(int nbPattes, String nomCheval, String couleur) {
        this.nbPattes = nbPattes;
        this.nomCheval = nomCheval;
        this.couleur = couleur;
    }

    public Cheval(int nbPattes, String nomCheval, String couleur, double taille) {
        this.nbPattes = nbPattes;
        this.nomCheval = nomCheval;
        this.couleur = couleur;
        this.taille = taille;
    }
}
