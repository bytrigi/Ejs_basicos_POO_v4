package e3;

public class Motor {
    private int cv;
    private boolean status; //false = off, true = on;

    public int getCv() {
        return cv;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Motor(int cvInput, boolean statusInput){
        this.cv = cvInput;
        this.status = statusInput;
    }
}
