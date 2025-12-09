public class AppFactory {
    public static void main(String[] args) {
        Guitariste guitariste1 = MusicienFactory.creerGuitariste(true);
        Guitariste guitariste2 = MusicienFactory.creerGuitariste(false);

        guitariste1.jouer();
        guitariste2.jouer();
    }
}
