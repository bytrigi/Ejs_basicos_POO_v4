package e4;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String DNI;
    private Cuenta cuenta;

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente(String nombreInput, String dniInput, Cuenta cuenta){
        this.nombre = nombreInput;
        this.DNI = dniInput;
        this.cuenta = cuenta;
    }

    public void mostrarInfo(){
        System.out.printf("==== Info cliente ====\n");
        System.out.printf("Nombre: %s\n", getNombre());
        System.out.printf("DNI: %s\n", getDNI());
        System.out.printf("Saldo: %d\n", cuenta.getSaldo());
        System.out.printf("======================\n");
        System.out.println();
    }

    public void addSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Cuanto dinero desa ingresar: ");
        int cantidadInput = sc.nextInt();
        cuenta.setSaldo(cuenta.getSaldo() + cantidadInput);
        System.out.printf("Se han ingresado %d a su cuenta. Su saldo actual es: %d\n", cantidadInput, cuenta.getSaldo());
        System.out.println();
    }

    public void retirarSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Cuanto dinero desa retirar: ");
        int cantidadInput = sc.nextInt();
        cuenta.setSaldo(cuenta.getSaldo() - cantidadInput);
        System.out.printf("Se han retirado %d de su cuenta. Su saldo actual es: %d\n", cantidadInput, cuenta.getSaldo());
        System.out.println();
    }
}
