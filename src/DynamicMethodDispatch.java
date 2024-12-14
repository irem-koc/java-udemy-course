class K{
    public void show(){
        System.out.println("show in k");
    }
}
class J extends  K{
    public void show(){
        System.out.println("show in J");
    }
}
class L extends  K{

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //it is a type of runtime polymorphism
        J obj = new J();
        K obj1 = new J(); //Object type is K but implementation is J
        obj1.show(); // at this time we can not understand which class will be using
        obj1 = new K();
        obj1.show();
    }
}
