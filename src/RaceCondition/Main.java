package RaceCondition;
class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable a = ()->{
            for (int i = 0; i < 1220; i++) {
                counter.increment();
            }
        };
        Runnable b = ()->{
            for (int i = 0; i < 1220; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
        //we have threads and mutations
        String n = "ndsklds";
        n = "dsk";
        System.out.println(n);
        String s1 = "java";

        // creates a new String "java rules",
        // but does not change s1
        s1.concat(" rules");
        // s1 still refers to "java"
        System.out.println("s1 refers to " + s1);

        //thread safe
    }
}
