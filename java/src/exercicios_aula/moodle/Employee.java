package exercicios_aula.moodle;

public class Employee {
    private String firstName;
    private String surName;
    private double salary;

    public Employee(String firstName, String surName, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary > 0 ? salary : 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
