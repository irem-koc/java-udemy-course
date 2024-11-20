//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + (i + 2));
        }
//        Primitive data types
        int number1 = 5;
//        byte by = 127;
//        short sh = 558;
//        long L = 58000L;
//
//        float number = 3.4F;
//        double d = 3.4;

        char c = 'i';
        c++;
//        boolean isOkay = true;
        System.out.println("number1 = " + number1);
        System.out.println("char c = " + c);
//        byte b = 127;
        int a = 800;
//        b = (byte) a; //explicit conversion - casting
//        a = b; //implicit conversion
        System.out.println("a = " + a);
        byte d = 12;
        int result = a * d; //type promotions
        System.out.println("result = " + result);
        int num1 = 8;
        int result1 = --num1; //pre-decrement first decrement then assign
        //post-decrement first assign then decrement
//        int result2 = num1++;
        System.out.println("result1 = " + result1 + " num1 = " );
//        System.out.println("result2 = " + result2);
//        System.out.println("num1 = " + num1);
    }
}