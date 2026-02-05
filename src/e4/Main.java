package e4;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1200);
        Cliente cliente = new Cliente("Adrian", "54158660P", cuenta);

        cliente.mostrarInfo();

        cliente.addSaldo();

        cliente.mostrarInfo();

        cliente.retirarSaldo();
    }
}