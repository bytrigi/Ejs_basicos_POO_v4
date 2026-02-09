package e6;

public class Team {
    private String name;
    private Player players[];

    public String getName() {
        return name;
    }

    public Team(String nameInput, Player[] playersInput) {
        this.name = nameInput;
        this.players = playersInput;
    }

    public void mostrarDatos(){
        System.out.println("===== Informacion del equipo =====");
        System.out.println("Nombre del equipo: " + getName());
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + ", " + players[i].getPos());
        }
    }
}
