package ExceptionHandling;

//Exceptions
//Errors
//1-Compile time error
//2-Runtime error -> we can say basically exceptions 
//3-Logical error: expecting a result but we couldnt saw a result that we expect
public class Main {
    public static void main(String[] args) {
//        System.out.prinln(); //syntactical error - compile time error
        int i = 4;
        int j = 1;
        String a = null;
        int[] nums = new int[2];
        try { //try to execute the statement iw everything is good it will execute the remaining statement
            j = 18/j;
            System.out.println(a.length());
            System.out.println(nums[0]);
            System.out.println(nums[3]);
        }catch (ArithmeticException e) { //catch block will be executed only in case of Exception otherwise this block will be skipped
            System.out.println("Cannot divide by zero " + e);
        } catch (Exception e) {//parent class should be placed at the end
            System.out.println("Something went wrong " + e);
        }
//        catch (ArrayIndexOutOfBoundsException e) { //catch block will be executed only in case of Exception otherwise this block will be skipped
//            System.out.println("Cannot access out of bounds " + e);
//        }
        System.out.println(j);

        System.out.println("Bye");

    }
}
