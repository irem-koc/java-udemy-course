package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5); // way of making list
//        for (int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        list.forEach(n -> System.out.println(n));
        // behind the scene
        Consumer<Integer> consumer = n -> System.out.println(n);
        list.forEach(consumer);

        System.out.println(list);
        int result = 0;
        for (Integer i : list) {
            if(i%2==0){
                result += i*2;
            }
        }
        System.out.println(result);
    }
}
