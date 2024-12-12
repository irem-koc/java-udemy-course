class A{
    public A(){
        System.out.println("constructor called");
    }
    public void show(){
        System.out.println("showing");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        int marks;
        marks = 99;
        A obj ; //reference creation
        obj= new A(); //we are creating the object here and assigning the value to object
        new A();// anonymous object
    }
}
