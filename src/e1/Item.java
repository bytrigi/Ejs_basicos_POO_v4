package e1;

public class Item {
    private String name;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amountInput) {
        this.amount = amount + amountInput;
    }

    public Item(String nameInput, int amountInput){
        this.name = nameInput;
        this.amount = amountInput;
    }
}
