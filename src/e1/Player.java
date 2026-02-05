package e1;

import java.util.Scanner;

public class Player {
    private int hp;
    private String name;
    private Item inventory[];

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public Player(String nameInput, int hpInput, Item inventoryInput[]){
        this.name = nameInput;
        this.hp =  hpInput;
        this.inventory = inventoryInput;
    }

    public void mostrarEstado(){
        System.out.print("==== Estado del jugador ====\n");
        System.out.printf("Nombre: %s\n", getName());
        System.out.printf("Vida: %s\n", getHp());
        System.out.printf("============================\n");

        System.out.println();
    }

    public void mostrarInventario(){
        System.out.printf("==== Inventory ====\n");
        for (int i = 0; i < inventory.length; i++) {
            System.out.printf("Slot %d: %s, %d\n", i+1, inventory[i].getName(), inventory[i].getAmount());
        }
        System.out.printf("============================\n");
        System.out.println();
    }

    public void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Selecciona el slot del inventario que quieres incrementar (1 - 10): ");
        int slot = sc.nextInt() - 1;
        System.out.printf("Cuantos elementos de %s quieres añadir: ", inventory[slot].getName());
        int amount = sc.nextInt();
        inventory[slot].setAmount(amount);
        System.out.printf("Añadido %d elementos de %s. Cantidad actual: %d", amount, inventory[slot].getName(), inventory[slot].getAmount());
        System.out.println();
    }
}
