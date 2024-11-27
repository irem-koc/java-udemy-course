public class Loops {
    public static void main(String[] args) {
//        for (int i=0;i<4;i++){
//            System.out.println("Hi");
//        }
//        int i=0;
//        while(i<4){
//            System.out.println("Hi " + i);
//            int j = 0;
//            while(j<3){
//                System.out.println("hi " + j);
//                j++;
//            }
//            i++;
//        }

//        do {
//            System.out.println("Hi " + i);
//            int j = 0;
//            do{
//                System.out.println("hi " + j);
//                j++;
//            }while(j<3);
//            i++;
//        }while (i<4);
        for (int i=0;i<7;i++){
            System.out.println("Day: " + i);
            for (int j=0;j<24;j++){
                System.out.println("Hour: " + j+1);
            }

        }
        int a = 3;

        int b = 6;

        int result = (~a & b) | (a & ~b);
        System.out.println(result);
        int x=2;

        switch(x) {

            case 1:

            case 2:
                break;

            case 3:

                System.out.println("Fly");

                break;

            case 4:

                System.out.println("Swim");

        }

    }
}
