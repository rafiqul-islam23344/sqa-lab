import java.util.*;

class Employee {
    String name;
    String designation;
    double basicSalary;
    double overtimeHours;
    double taxRate;

    Employee(String name, String designation, double basicSalary, double overtimeHours, double taxRate) {
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
        this.taxRate = taxRate;
    }
}

public class PayMaster {
    static final double OVERTIME_RATE = 100.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- PayMaster: Salary Calculator ---");
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();
        System.out.print("Enter tax rate (%): ");
        double taxRate = scanner.nextDouble();

        Employee emp = new Employee(name, designation, basicSalary, overtimeHours, taxRate);
        double totalSalary = calculateSalary(emp);

        System.out.println("\n--- Salary Breakdown ---");
        System.out.println("Name: " + emp.name);
        System.out.println("Designation: " + emp.designation);
        System.out.println("Basic Salary: BDT " + emp.basicSalary);
        System.out.println("Overtime Bonus: BDT " + (emp.overtimeHours * OVERTIME_RATE));
        System.out.println("Tax Deduction: BDT " + (emp.basicSalary * emp.taxRate / 100));
        System.out.println("Net Salary: BDT " + totalSalary);
    }

    static double calculateSalary(Employee emp) {
        double overtimeBonus = emp.overtimeHours * OVERTIME_RATE;
        double tax = emp.basicSalary * emp.taxRate / 100;
        return emp.basicSalary + overtimeBonus - tax;
    }
}

