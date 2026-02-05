package e2;

public class Curso {
    private String nombre;
    private int cantidad;
    private Alumno alumnos[];

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Curso(String nameInput, int cantidadInput){
        this.nombre = nameInput;
        this.cantidad = cantidadInput;
    }

    public void mostrarInfo(){
        System.out.printf("==== Info del curso ====\n");
        System.out.printf("Nombre: %s\n", getNombre());
        System.out.printf("Cantidad: %d\n", getCantidad());
        System.out.printf("=========================\n");
        System.out.println();
        System.out.printf("==== Info de cada alumno ====\n");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("Alumno %d: %s, %d\n",i+1, alumnos[i].getNombre(), alumnos[i].getNotaMedia());
        }
        System.out.printf("=============================\n");
        System.out.println();
    }
}
