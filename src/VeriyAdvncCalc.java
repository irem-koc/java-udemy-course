public class VeriyAdvncCalc extends AdvanceCalc{
    public int power(double num1, double num2){
        return (int)Math.pow(num1, num2);
    }
}
// this is a multi level inheritance
//Java does not support multiple inheritance because if both parent classes have the same method, it creates ambiguity about which implementation should be chosen.
