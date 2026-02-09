package e5;

import java.util.Scanner;

public class Biblioteca {
    private Libro libros[];

    public Biblioteca(Libro librosInput[]){
        this.libros = librosInput;
    }

    public void mostrarLibros(){
        System.out.println("==== Contenido de la biblioteca ====");
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i].getTitulo() + ", " + libros[i].getAutor());
        }
        System.out.println("==================================");
        System.out.println();
    }

    public void addLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el nombre del libro a aniadir: ");
        String titleInputAdd = sc.nextLine();
        System.out.printf("Introduce su autor: ");
        String autorInputAdd = sc.nextLine();
        Libro librosNuevo[] = new Libro[libros.length+1];
        for (int i = 0; i < libros.length; i++) {
            librosNuevo[i] = libros[i];
        }
        librosNuevo[libros.length] = new Libro(titleInputAdd, autorInputAdd);
        this.libros = librosNuevo;
        System.out.println("Libro aniadido!");
    }
}
