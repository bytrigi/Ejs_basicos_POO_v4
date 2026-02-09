package e10;

import java.util.Scanner;

public class Carrito {
    private Product products[];

    public Carrito(Product[] products) {
        this.products = products;
    }

    public void mostrarContenido(){
        System.out.println("===== Contenido del carrito =====");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + ", " + products[i].getPrice());
        }
        System.out.println("================================");
        System.out.println();
    }

    public void addProducts(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el nombre del producto a aniadir: ");
        String nameInputAdd = sc.nextLine();
        System.out.printf("Introduce su precio: ");
        int priceInputAdd = sc.nextInt();
        Product productNuevo[] = new Product[products.length+1];
        for (int i = 0; i < products.length; i++) {
            productNuevo[i] = products[i];
        }
        productNuevo[products.length] = new Product(nameInputAdd, priceInputAdd);
        this.products = productNuevo;
        System.out.println("Producto aniadido!");
        System.out.println();
    }

    public int calcularTotal(){
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
}
