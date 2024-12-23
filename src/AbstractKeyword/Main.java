package AbstractKeyword;
abstract class CarClass {
//    public void run() {
// if we dont know about the execution type or block we should declare functions as abstract
    //also we cannot instantiated abstract classes
    //if we dont want to implement all of the method of abstract super class we should declare sub class again
    //abstract class
//    }
    public abstract void run();
    public void playMusic(){
        System.out.println("Play music");
    }
}
class Wagon extends CarClass {//concrete

    @Override
    public void run() {
        System.out.println("wagon run");
    }
}
public class Main {
    public static void main(String[] args) {
        Wagon carClass = new Wagon();
        carClass.run();
        carClass.playMusic();
    }
}
