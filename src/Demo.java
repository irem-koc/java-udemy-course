import other.*;
public class Demo {
    public static void main(String[] args) {
        H obj = new H();
        System.out.println(obj.a); //package dışı erişim olabilmesi için a nın public olarak işaretlenmesi gerekir
        //method çoğunlukla public olurken variablerlar pek tercih edilmez
        //package konusu dışarıda bırakılarak bakıldığında private sadece aynı classta kullanılabilir.
        NewDemo demo = new NewDemo();
        System.out.println(demo.a);

    }

}
