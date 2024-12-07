class Mobile{

    //instance variables
    int price;
    String brand;
    static String name; // common in all object
    static { //called first
        name = "samsun";
        System.out.println("static block");
    }
    //so we can call this variables with class not object
    public Mobile(){
        brand = "Samsung";
        name = "Samsung";
        price = 50;
        System.out.println("constructor block");

    }
    public void showModel(){
        // if there is a variable it is local variable
        System.out.println("Brand: " + brand + ", Network: "  + ", Name: " + name);
    }

//class loads and objects initialized
    //class loading first static block runs first and then created object and constructor called
    //if you dont create an object the class will not loaded
//    public static void show1() {
////        static method içerisinde sadece static variablelar kullanılabilir
//        System.out.println("variable in static method " + name);
//    }
}
public class UsingStaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile m = new Mobile();
        m.brand = "Apple";
//        m.name = "iPhone";
        m.price = 1000;
        Mobile.name="iPhone";

        m.showModel();
        //loading but not instantiating
        Class.forName("Mobile");
    }
}
