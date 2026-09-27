package exercicios_aula.moodle;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bruno", "Fulano", 5000);
        Employee employee2 = new Employee("Brunao", "Fulano", 6000);

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getSurName() + ", Salario: " + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getSurName() + ", Salario: " + employee2.getSalary());
        employee1.setSalary(employee1.getSalary() * 1.10);
        employee2.setSalary(employee2.getSalary() * 1.10);

        System.out.println("Aumento de 10%:");
        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getSurName() + ", Salario: " + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getSurName() + ", Salario: " + employee2.getSalary());
    }
}
