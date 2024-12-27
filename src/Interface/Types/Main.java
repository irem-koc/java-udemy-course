package Interface.Types;
@FunctionalInterface
interface A {
    void show(int i);
}
@FunctionalInterface
interface K {
    int add(int i, int j);
}
class B implements A {
    public void show(int i) {
        System.out.println("B");
    }
}
public class Main {
    public static void main(String[] args) {
        //interface types: Normal, Functional(SAM - Single abstract method), Marker
        // if there is two or more method it is normal interface
        //if only one method it is functional interface
        //if there is no method it is blank interface and marker interface for update something to compiler
        //>loading data from heap to hardware: serialization
        // loading data from hardware to the heap memory: deserialization
//        A obj = new B();
        //or
//        A obj = new A(){
//            public void show() {
//                System.out.println("A");
//            }
//        };
        //or
        A obj = i -> System.out.println("A" + i); //also it will not create another file
        //lambda expression can be used as a shortened way with only functional interface
        obj.show(5);
        K obj2 = ( j,  p) -> j + p; // j + p is an expression and it becomes default return
        int result = obj2.add(5,6);
        System.out.println(result);
    }
}
