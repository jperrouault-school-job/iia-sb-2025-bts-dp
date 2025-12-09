public class Guitariste {
    // private Guitare guitare = new Guitare();
    private Guitare guitare;

    public void setGuitare(Guitare guitare) {
        this.guitare = guitare;
    }

    public Guitariste() { }

    public Guitariste(Guitare guitare) {
        this.guitare = guitare;
    }

    public void jouer() {
        System.out.println("Le guitariste joue " + this.guitare);
    }

}
