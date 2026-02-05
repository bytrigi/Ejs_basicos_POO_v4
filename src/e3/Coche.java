package e3;

public class Coche {
    private String marca;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public Coche(String marcaInput, Motor motorInput){
        this.marca = marcaInput;
        this.motor = motorInput;
    }

    public void mostrarInfo(){
        System.out.printf("==== Info del coche ====\n");
        System.out.printf("Marca: %s\n", getMarca());
        System.out.printf("Potencia: %d\n", motor.getCv());
        if (!motor.isStatus()){
            System.out.printf("Status motor: apagado\n");
        } else {
            System.out.printf("Status motor: encendido\n");
        }
        System.out.printf("=========================\n");
        System.out.println();
    }

    public void encederMotor(){
        if (motor.isStatus()){
            System.out.printf("El motor ya esta encendido.\n");
            System.out.println();
        } else {
            motor.setStatus(true);
            System.out.printf("Encendiendo motor...\n");
            System.out.println();
        }
    }

    public void apagarMotor(){
        if (!motor.isStatus()){
            System.out.printf("El motor ya esta apagado.\n");
            System.out.println();
        } else {
            motor.setStatus(false);
            System.out.printf("Apagando motor...\n");
            System.out.println();
        }
    }
}
