class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Emp_main {
    public static void main(String[] args) {

        SalesEmployee emp = new SalesEmployee();

        emp.baseSalary = 50000;
        emp.bonus = 10000;

        System.out.println("Total Salary = " + emp.calculateSalary());
    }
}