package e7;

public class Order {
    private int orderNumber;
    private Product products[];

    public int getOrderNumber() {
        return orderNumber;
    }

    public Order(int orderNumberInput, Product productsInput[]){
        this.orderNumber = orderNumberInput;
        this.products = productsInput;
    }

    public int calculateTotal(){
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
}
