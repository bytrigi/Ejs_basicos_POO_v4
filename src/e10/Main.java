package e10;

public class Main {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Leche",1);
        products[1] = new Product("Huevos",2);
        products[2] = new Product("Miel",4);
        products[3] = new Product("Yogures",2);
        products[4] = new Product("Agua",1);
        Carrito carrito = new Carrito(products);

        carrito.mostrarContenido();

        carrito.addProducts();

        carrito.mostrarContenido();

        System.out.println("El total del carrito es de " + carrito.calcularTotal());
    }
}