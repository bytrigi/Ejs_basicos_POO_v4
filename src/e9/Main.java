package e9;

public class Main {
    public static void main(String[] args) {
        Empleado empleados[] = new Empleado[5];
        empleados[0] = new Empleado("Agustin", 50);
        empleados[1] = new Empleado("Martin", 500);
        empleados[2] = new Empleado("Sergio", 450);
        empleados[3] = new Empleado("Yohan", 300);
        empleados[4] = new Empleado("Juan", 200);
        Empresa empresa = new Empresa(empleados);

        empresa.mostrarEmpleados();
        System.out.println();
        System.out.println();
        System.out.println("El total de salarios: " + empresa.calcularTotalSalarios());

    }
}