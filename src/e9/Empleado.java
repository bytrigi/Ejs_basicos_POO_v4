package e9;

public class Empleado {
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Empleado(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
