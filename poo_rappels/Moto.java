public class Moto extends Vehicule implements Inclinable, Motorisable {
    public void reculer() {
        System.out.println("La moto recule !");
    }

    @Override
    public void incliner() {
        System.out.println("La moto s'incline !");
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage de la moto VROOM VROOM !!");
    }
}
