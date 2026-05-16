package decision;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {


        //1.initialize what we know
        int weeklyHourRange = 32;
        double ratePerHour = 10;
        double bonusAmount = 5;

        //2.get number of worked hour
        System.out.println("enter work hour per week ");
        Scanner scanner = new Scanner(System.in);
        int workHours = scanner.nextInt();
        scanner.close();

        //3.multiply work hours and rate
        double payable = workHours * ratePerHour;

        //4.check for eligibility for bonus
        if (workHours > weeklyHourRange)
        {
            payable = payable + bonusAmount;
        System.out.println("u r eligibile for bonus  ");
        }
        else if (workHours==weeklyHourRange)
        {

            System.out.println("try more  ");
        }

        else
        {
            System.out.println("u r not eligibile for bonus  ");
        }

        //4.display results
        System.out.println("employee salary:"+payable);
        scanner.close();
    }
}
