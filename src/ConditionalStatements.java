public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 8;

        int y = 8;

        //more than one line than we should use '{ }' brackets
        if (x > y) {
            System.out.println("x buyuktur");
        }
        else if(x==y){
            System.out.println("eşitler");
        }
        else
            System.out.println("y buyuktur");

        int n=1;

        switch (n){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            default:
                System.out.println("1 ya da 2 giriniz.");
        }

    }
}