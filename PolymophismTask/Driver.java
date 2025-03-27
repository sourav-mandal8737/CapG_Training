package PolymophismTask;

public class Driver {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Ram Roy", 50000, 5000);
        emp1.employeeInfo();

        Employee emp2 = new PartTimeEmployee("Raj Roy", 30000, 20);
        emp2.employeeInfo();

        details(emp1);
        details(emp2);
    }

    public static void details(Employee e) {
        e.jobRole();

        if (e instanceof PartTimeEmployee) {
            ((PartTimeEmployee) e).getDesignation();
        }
    }
}



