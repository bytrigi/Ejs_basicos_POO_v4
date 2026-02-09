package e8;

import java.util.Scanner;

public class Hotel {
    private Room rooms[];

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public int calculatePrice(){
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Que habitación desea (1-%d): ", rooms.length);
        int room = sc.nextInt();
        System.out.printf("Cuantas noches: ");
        int nights = sc.nextInt();
        total = rooms[room-1].getPrice() * nights;
        return total;
    }
}
