package e9;

public class Empresa {
    private Empleado empleados[];

    public Empresa(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void mostrarEmpleados(){
        System.out.println("===== Lista de empleados =====");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getName() + ", " + empleados[i].getSalary());
        }
    }

    public int calcularTotalSalarios(){
        int total = 0;
        for (int i = 0; i < empleados.length; i++) {
            total += empleados[i].getSalary();
        }
        return total;
    }
}
