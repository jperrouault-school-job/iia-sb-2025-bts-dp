public class AppFactory {
    public static void main(String[] args) {
        Guitariste guitariste = new Guitariste();
        Guitare guitare = new Guitare();

        guitariste.setGuitare(guitare);

        guitariste.jouer();
    }
}
