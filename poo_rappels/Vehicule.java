public abstract class Vehicule {
    private String modele;
    private int poids;

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Vehicule(String modele, int poids) {
        System.out.println("CREATION DU VEHICULE " + modele);
        this.modele = modele;
        this.poids = poids;
    }

    public Vehicule() {
        System.out.println("CREATION D'UN VEHICULE");
    }

    public abstract void reculer();
}
