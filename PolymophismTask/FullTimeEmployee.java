package PolymophismTask;

class FullTimeEmployee extends Employee {
    private int bonus;

    public FullTimeEmployee(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    
    public void employeeInfo() {
        super.employeeInfo();
        System.out.println("Bonus: " + bonus);
    }

    public void jobRole() {
        System.out.println("Full-time employee with Developer role.");
    }
}
