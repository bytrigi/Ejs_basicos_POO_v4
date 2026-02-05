package e1;

public class Main {
    public static void main(String[] args) {
        Item inventory[] = new Item[10];
        inventory[0] = new Item("Hacha", 1);
        inventory[1] = new Item("Arena", 4);
        inventory[2] = new Item("Espada", 1);
        inventory[3] = new Item("Escudo", 1);
        inventory[4] = new Item("Pocion de cura", 5);
        inventory[5] = new Item("Carne de pollo", 1);
        inventory[6] = new Item("Piedra", 15);
        inventory[7] = new Item("Madera", 30);
        inventory[8] = new Item("Cristal", 7);
        inventory[9] = new Item("Ballesta", 1);
        Player player1 = new Player("BYTRIGI", 100, inventory);

        player1.mostrarEstado();

        player1.mostrarInventario();

        player1.addItem();
    }
}