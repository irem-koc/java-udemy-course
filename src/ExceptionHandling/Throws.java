package ExceptionHandling;
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Throws");
    }
}
public class Throws {
    static {
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        // I will not handle the exception I will throw only it means throws -> ducking exception
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
