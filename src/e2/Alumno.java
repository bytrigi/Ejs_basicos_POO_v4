package e2;

public class Alumno {
    private String nombre;
    private int notaMedia;

    public String getNombre() {
        return nombre;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public Alumno(String nombreInput, int mediaInput){
        this.nombre = nombreInput;
        this.notaMedia = mediaInput;
    }
}
