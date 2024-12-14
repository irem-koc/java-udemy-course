//it can be used variables methods and class

//making class final basically we can stop the inheritance!
 class Car{
    public final void show(){
        System.out.println("show method");
    }
    //definition of the method with final keyword we can not override it in any sublass
    public void add(int n, int n2){
        System.out.println("add method");
    }
}
class ExtendIt extends  Car{
//    public void show(){
//        System.out.println("ExtendIt show method");
//    }
    public void show(int a){
        System.out.println("ExtendIt show method");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
//        final means that constant you can not change the value
        final int num = 8;
        System.out.println(num + "is the value");
        ExtendIt e = new ExtendIt();
        e.show(num);
    }
}
