package Enum;
enum Status {//it is actually a class and below strings actually objects
    Running, Failed, Pending, Success //named constants
}
enum Laptop {
    Macbook(2000), Dell(3000), ThinkPad, Surface(2000);
    private int price;
    //we use private constructor because we are creating objects in the same class
    private Laptop(){
        price = 0;
    }
    private Laptop(int price){
         this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop.getPrice());
        for (Laptop l : Laptop.values()) {
            System.out.println(l.getPrice());
        }
        Status status = Status.Running;
        System.out.println(status.ordinal());
        for (Status s : Status.values()) {//we can get all of the objects
            System.out.println(s + " : " + s.ordinal());
        }
        System.out.println(status.getClass().getSuperclass());
//        if(status == Status.Running)
//            System.out.println("All running");
//        else if(status == Status.Failed)
//            System.out.println("All failed");
//        else if (status == Status.Pending)
//            System.out.println("All pending");
//        else{
//            System.out.println("All done");
//        }
//        switch (status){
//            case Running:
//                System.out.println("Running");
//                break;
//            case Failed:
//                System.out.println("Failed");
//                break;
//            case Pending:
//                System.out.println("Pending");
//                break;
//            case Success:
//                System.out.println("Success");
//                break;
//        }

    }
}
