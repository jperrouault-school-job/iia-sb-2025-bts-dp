import java.util.ArrayList;
import java.util.List;

public class AppRappels {
    // psvm ou main
    public static void main(String[] args) {
        // sout ou sysout
        // System.out.println("Hello world!");

        Vehicule voiture = new Voiture("Renault", 1200);
        Vehicule moto = new Moto();
        List<Vehicule> vehicules = new ArrayList<>();

        vehicules.add(voiture);
        vehicules.add(moto);

        for (Vehicule vehicule : vehicules) {
            vehicule.reculer();
        }

        // vehicule.reculer();

        // voiture.reculer();
        // moto.reculer();


    }
}

