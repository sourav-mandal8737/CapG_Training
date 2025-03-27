package PolymophismTask;

class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, double salary, int workingHours) {
        super(name, salary);
        this.workingHours = workingHours;
    }

    @Override
    public void employeeInfo() {
        super.employeeInfo();
        System.out.println("Working Hours: " + workingHours);
    }

    public void getDesignation() {
        System.out.println("Designation: Associate Software Engineer");
    }

    @Override
    public void jobRole() {
        System.out.println("Job role of part-time employee is Cloud Engineer.");
    }
}
