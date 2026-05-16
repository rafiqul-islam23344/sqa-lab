package basic;

public class methodOrFunctionTest {

    public static void main(String[] args){
     int  addition = getSum(100, 50);
        System.out.println(addition);

    }

    public static int  getSum (int x, int y) {
         int    sum = x+y;
         return sum;
    }
}
