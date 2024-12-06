class Calculator{
    public int add(int a, int b){
        System.out.println("adding..");
        return a+b;
    }
    //Method Overloading
    public int add(int a, int b, int c){
        System.out.println("adding..");
        return a+b+c;
    }
}
public class ObjectPracticals {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        System.out.println(result + " is the result of add function");
        int num3 = 5;

        int result2 = calculator.add(num1, num2, num3);
        System.out.println(result2 + " is the result of add function");
    }
}
