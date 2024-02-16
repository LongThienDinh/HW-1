import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class EmployeeTest {
    private static void printEmployeeDetails(Employee employee) {
        String details = String.format("%-12s %-11s %-14s", employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber());

        String weeklySalary = "", wage = "", numberOfHoursWorked = "", commissionRate = "", grossSales = "", baseSalary = "";

        if (employee instanceof SalariedEmployee) 
        {
            weeklySalary = String.format("$%.2f", ((SalariedEmployee) employee).getWeeklySalary());
        } 
        else if (employee instanceof HourlyEmployee) 
        {
            wage = String.format("$%.2f", ((HourlyEmployee) employee).getWage());
            numberOfHoursWorked = String.format("%.0f", ((HourlyEmployee) employee).getNumberOfHoursWorked());
        } 
        else if (employee instanceof CommissionEmployee) 
        {
            commissionRate = String.format("%.2f%%", ((CommissionEmployee) employee).getCommissionRate() * 100);
            grossSales = String.format("$%.2f", ((CommissionEmployee) employee).getGrossSales()); 
        } 
        else
        {
            baseSalary = String.format("$%.2f", ((BaseEmployee) employee).getBaseSalary());
        }

        System.out.printf("%s %-15s %-7s %-14s %-10s %-14s %-12s%n", details, weeklySalary, wage, numberOfHoursWorked, commissionRate, grossSales, baseSalary);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        employees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        employees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        employees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        employees.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000));
        employees.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000));
        employees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));

        employees.sort(Comparator.comparing(Employee::getFirstName));

        System.out.printf("%-12s %-11s %-14s %-15s %-7s %-14s %-10s %-14s %-12s%n", "First Name", "Last Name", "Social Sec #", "Weekly Salary", "Wage", "Hours worked", "Com rate", "Gross salary", "Base Salary");

        for (Employee employee : employees) {
            printEmployeeDetails(employee);
        }
    }
}
