package e6;

public class Player {
    private String name;
    private String pos;

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public Player(String nameInput, String posInput) {
        this.name = nameInput;
        this.pos = posInput;
    }
}
