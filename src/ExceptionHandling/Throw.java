package ExceptionHandling;
class MyException extends Exception{ // we should extend our exception classes with RuntimeException or Exception
    public MyException(String message) {
        super(message);
        System.out.println("MyException: " + message);
    }
}
public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if(j==0){
                throw new MyException("dont send 0");
            }
        }catch (MyException e) { //catch block will be executed only in case of Exception otherwise this block will be skipped
            System.out.println("MyException " + e);
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
