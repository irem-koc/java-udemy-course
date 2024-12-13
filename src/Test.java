class Message{
    public void printMessage(int message) {

        System.out.println("Message primitive: " + message);

    }
    public void printMessage(Integer message) {

        System.out.println("Message object: " + message);
        //every class has its own package in java and by default java.lang* packa imported so System.out. import edilmez böylece
        // * means all the files not folders!
    }
}


public class Test {
    public static void main(String[] args) {
        Message ob=new Message();
        ob.printMessage(5);
    }
}
