package e3;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(250, false);
        Coche coche = new Coche("Rx7", motor);

        coche.mostrarInfo();

        motor.encederMotor();

        coche.mostrarInfo();

    }
}