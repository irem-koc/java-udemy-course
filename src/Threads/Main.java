package Threads;
class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
        }
    }
    public void a(){
        for(int i=1;i<=100;i++){
            System.out.println("ahi");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //software runs on operating system
        //hardware we have physical set - cpu(execute something) ram(temporary memory for processing)
        // multiple softwares working parallel so it means multitasking
        //in the same task in the same program we have multiple threads

        // with complex frameworks we don't need to do create threads by manually

        A a = new A();
        B b = new B();
        a.start(); //you cannot execute normal objects in multithread
        a.a(); //you cannot execute normal objects in multithread
        b.start();
        // in the operating system we have scheduler its job is the define which thread will be run on the cpu

    }
}
