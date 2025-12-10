public class Velo extends Vehicule implements Inclinable {
    private Velo() {
        System.out.println("CONSTRUCTION D'UN VELO");
    }

    public static Velo creerVelo() {
        return new Velo();
    }

    @Override
    public void reculer() {
        System.out.println("Le vélo recule !");
    }

    @Override
    public void incliner() {
        System.out.println("Le vélo s'incline !");
    }
}
