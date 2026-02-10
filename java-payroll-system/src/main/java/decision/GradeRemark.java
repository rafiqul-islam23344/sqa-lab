package decision;

import java.util.Scanner;

public class GradeRemark {

    public static void main(String[] args) {
        System.out.println("write your grade");
       Scanner scanner =new Scanner(System.in);
       String grade = scanner.next();
       scanner.close();
       String msg;

    switch (grade){
        case "A":
            msg="great job  ";
            break;
        case "B":
            msg="good job  ";
            break;
        case "C":
            msg="you have to work bit more   ";
            break;
        case "F":
            msg="oh no,better luck next time   ";
            break;
        default:
            msg="error,invalid input ";
    }
        System.out.println(msg);
    }
}
