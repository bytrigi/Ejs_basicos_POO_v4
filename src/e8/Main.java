package e8;

public class Main {
    public static void main(String[] args) {
        Room rooms[] = new Room[5];
        rooms[0] = new Room(1, 100);
        rooms[1] = new Room(2, 200);
        rooms[2] = new Room(3, 300);
        rooms[3] = new Room(4,400);
        rooms[4] = new Room(5, 500);
        Hotel hotel = new Hotel(rooms);

        System.out.println("El precio total es de " + hotel.calculatePrice());
    }
}