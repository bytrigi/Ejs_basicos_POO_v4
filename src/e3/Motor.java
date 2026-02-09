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

    public Motor(int cvInput, boolean statusInput){
        this.cv = cvInput;
        this.status = statusInput;
    }

    public void encederMotor(){
        if (this.status){
            System.out.printf("El motor ya esta encendido.\n");
            System.out.println();
        } else {
            this.status = true;
            System.out.printf("Encendiendo motor...\n");
            System.out.println();
        }
    }

    public void apagarMotor(){
        if (!this.status){
            System.out.printf("El motor ya esta apagado.\n");
            System.out.println();
        } else {
            this.status = false;
            System.out.printf("Apagando motor...\n");
            System.out.println();
        }
    }
}
