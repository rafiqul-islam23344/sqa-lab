package basic;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {


        //1.get number of work hours
        System.out.println("enter work hours  ");
        Scanner scanner=new Scanner(System.in);
        int hours =scanner.nextInt();

        //2.get hourly rate
        System.out.println("enter work hourly rate  ");
        double rate =scanner.nextDouble();

        //3.multiply work hours and rate
        double payable =hours*rate;

        //4.display results
        System.out.println("employee salary:"+payable);
        scanner.close();
    }
}
