public class Voiture extends Vehicule {

    public Voiture() {
        super("DEFAUT", 1000);
        System.out.println("CREATION D'UNE VOITURE");
    }

    public Voiture(String modele, int poids) {
        super(modele, poids);
    }

    public Voiture(int poids) {

    }

    public Voiture(String modele) {

    }

    public void reculer() {
        System.out.println("La voiture recule !");
    }
}
