package e6;

public class Main {
    public static void main(String[] args) {
        Player players[] = new Player[11];
        players[0] = new Player("Alvaro Ferllo", "Portero");
        players[1] = new Player("Miguel Loureiro", "Central");
        players[2] = new Player("Giacomo Quagliatta", "Lateral Izquierdo");
        players[3] = new Player("Lucas Noubi", "Central");
        players[4] = new Player("Adria Altimira", "Lateral Derecho");
        players[5] = new Player("Mario Soriano", "Centrocampista");
        players[6] = new Player("Jose Angel", "Centrocampista");
        players[7] = new Player("Luismi Cruz", "Centrocampista");
        players[8] = new Player("Yeremay Hernandez", "Extremo Izquierdo");
        players[9] = new Player("David Mella", "Extremo Derecho");
        players[10] = new Player("Zakaria Eddachouri", "Punta");
        Team team = new Team("Deportivo de la Corunia", players);

        team.mostrarDatos();
    }
}