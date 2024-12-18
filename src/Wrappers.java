public class Wrappers {
    public static void main(String[] args) {
        //for every primitive we have wrapper class
//        int -> Int, double -> Double
        int num = 7;
        //Integer num2 = new Integer(9); // it is deprecated :(
        Integer num3 = 10; // it is not deprecated :) // this concept is boxing, we are taking a primitive value
        // and storing in primitive object
        Integer num4 = num; //autoboxing

        int num5 = num4.intValue(); //unboxing
//        int num5 = num4; //auto-unboxing

        String str = "7";
        int number = Integer.parseInt(str);
        System.out.println(number * 2);
    }

}
