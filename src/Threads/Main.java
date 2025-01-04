package Threads;
class A implements Runnable{ //or implements Runnable
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void a(){
        for(int i=1;i<=10;i++){
            System.out.println("ahi");

        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

//        Runnable a = new A();
//        Runnable b = new B();
        Runnable a = () -> {
            for(int i=1;i<=10;i++){
                System.out.println("Hello!");
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable b = () -> {
            for(int i=1;i<=10;i++){
                System.out.println("Hi there!");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(a);
        Thread t1 = new Thread(b);
        t.start();
        t1.start();
        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
//
//        a.setPriority(Thread.MAX_PRIORITY);
//        b.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(a.getPriority()); //1 to 10 5 is default priority
//        System.out.println(b.getPriority());
//        a.start(); //you cannot execute normal objects in multithread
//        a.a(); //you cannot execute normal objects in multithread
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        b.start();
        // in the operating system we have scheduler its job is the define which thread will be run on the cpu
        //in threads we have priority
    }
}
