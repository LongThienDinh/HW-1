public class HourlyEmployee extends Employee {
    private double wage;
    private double numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double numberOfHoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }
}