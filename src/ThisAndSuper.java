class B extends Object {
    public B(){
        //by default every constructor the first statement is super() also in here because...
        // every class in the java extends Object class
        super();
        System.out.println("in B");
    }
    public B(int k){
        //by default every constructor the first statement is super()
        super();
        System.out.println("in B int used");
    }
}
class C extends B{
    public C(){
        //by default every constructor the first statement is super()
        super(); // standartly it means that call the default constructor of super class
        System.out.println("in C");
    }
    public C(int a){
        //by default every constructor the first statement is super()
//        super(a);
        this();//will execute the constructor of same class if we dont pass a variable default constructor calling like super method
        System.out.println("in C int using");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        C c = new C(4); // it will call the constructor of subclass and superclass both

    }
}
