package e2;

public class Main {
    public static void main(String[] args) {

        Alumno alumnos[] = new Alumno[5];
        alumnos[0] = new Alumno("Sergio", 3);
        alumnos[1] = new Alumno("Martin", 7);
        alumnos[2] = new Alumno("Agustin", 0);
        alumnos[3] = new Alumno("Juan", 5);
        alumnos[4] = new Alumno("Yohan", 2);
        Curso curso = new Curso("1B", alumnos.length);

        curso.mostrarInfo();
    }
}