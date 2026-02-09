package e5;

public class Main {
    public static void main(String[] args) {
        Libro libros[] = new Libro[5];
        libros[0] = new Libro("Cien años de soledad","Gabriel García Márquez");
        libros[1] = new Libro("1984","George Orwell");
        libros[2] = new Libro("Orgullo y prejuicio","Jane Austen");
        libros[3] = new Libro("El principito","Antoine de Saint-Exupéry");
        libros[4] = new Libro("Don Quijote de la Mancha","Miguel de Cervantes");
        Biblioteca biblioteca = new Biblioteca(libros);

        biblioteca.mostrarLibros();

        biblioteca.addLibro();
        System.out.println();

        biblioteca.mostrarLibros();
    }
}