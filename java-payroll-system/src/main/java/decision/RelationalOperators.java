package decision;

public class RelationalOperators {

    public static void main(String[] args) {
        if (1<3)
            System.out.println("1. 1 is less than 3");
        if (1>0)
            System.out.println("2. 1 is greater  than 0");
        if (1<=2)
            System.out.println("3. 1 is less than or equal to 2");
        if (1>=2)
            System.out.println("4. 1 is greater or equal to 2");
        if (2!=2)
            System.out.println("5. 2 is not equal 2");

        String value1 ="A";
        String value2 ="A";
        if (value1.equals(value2))
            System.out.println("6.value1 is equal to value2");

        if (2!=3&&1==1)
            System.out.println("7.2 is not equal 3 and 1 is equal to 1");

        //or
        if (2!=2||1==1)
            System.out.println("8.2 is not equal 2 or 1 is equal to 1");

    }
}
