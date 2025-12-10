import java.util.ArrayList;
import java.util.List;

public class AppRappels {
    // psvm ou main
    public static void main(String[] args) {
        // sout ou sysout
        // System.out.println("Hello world!");

        Vehicule voiture = new Voiture("Renault", 1200);
        Vehicule moto = new Moto();
        Velo velo = Velo.creerVelo();
        List<Vehicule> vehicules = new ArrayList<>();

        vehicules.add(voiture);
        vehicules.add(moto);
        vehicules.add(velo);

        for (Vehicule vehicule : vehicules) {
            if (vehicule instanceof Motorisable) {
                // ((Motorisable) vehicule).demarrer();
                Motorisable motorisable = (Motorisable) vehicule;
                motorisable.demarrer();
            }

            // Depuis JAVA 14
            if (vehicule instanceof Motorisable motorisable) {
                motorisable.demarrer();
            }

            vehicule.reculer();
        }

        // vehicule.reculer();

        // voiture.reculer();
        // moto.reculer();


    }
}

