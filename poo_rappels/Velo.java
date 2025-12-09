public class Velo extends Vehicule implements Inclinable {
    @Override
    public void reculer() {
        System.out.println("Le vélo recule !");
    }

    @Override
    public void incliner() {
        System.out.println("Le vélo s'incline !");
    }
}
