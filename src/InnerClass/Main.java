package InnerClass;
class A{ //not here static
    int age;
    public void show(){ //non static method
        System.out.println("");
    }
    static class B{ //only inner class -- COMPOSİTİON AND AGGREGATİON
        public void config(){
            System.out.println("inner worked");
        }
    }
}
class C {
    public void show(){
        System.out.println("in show method");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        b.config();
        C c = new C(){ //with this we are creating this anonymous class not C
            //anonymous inner class
            public void show(){
                System.out.println("c inner worked");
            }
        };
        c.show();
    }
}
