class Calculator{
    int a;
    public int add(int a, int b){
        System.out.println("adding..");
        return a+b;
    }
}
public class ObjectPracticals {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        System.out.println(result + " is the result of add function");
    }
}
