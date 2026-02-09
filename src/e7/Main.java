package e7;

public class Main {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Mantequilla", 2);
        products[1] = new Product("Leche", 1);
        products[2] = new Product("Cocacola", 2);
        products[3] = new Product("Galletas", 5);
        products[4] = new Product("Vino", 10);
        Order order = new Order(325262, products);

        System.out.println("La suma total del pedido es: " + order.calculateTotal());
    }

}