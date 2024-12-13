class D{
    public void show(){
        System.out.println("show in D class");
    }
}
class E extends D{
    public void show(){
        System.out.println("show in E class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        E obje = new E();
        obje.show();
    }
}
