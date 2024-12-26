package Interface;
interface A{
    //every method is default public abstract
    //like abstract class we can not instantiate interfaces
    //just show the design
    int age=3; //static and final
    void show();
    public abstract void config(String s);
}

interface X{
    void show();
}
class C implements A,X{

    @Override
    public void show() {

    }

    @Override
    public void config(String s) {

    }


}
abstract class B implements A,X{
    @Override
    public void config(String s) {
        System.out.println("sa");
    }
}
public class Main {
    public static void main(String[] args) {
    A obj = new C() ;
    obj.show();
    }
}
