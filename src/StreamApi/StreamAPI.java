package StreamApi;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5); // way of making list
        Stream<Integer> s1 = list.stream();
//        s1.forEach(n -> System.out.print(n + " "));
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int res = s3.reduce(0, (c,n) -> c + n);
        System.out.println(res);
//        s3.forEach((n)-> System.out.println(n));
//        s1.forEach(n -> System.out.print(n + " ")); // we can not use stream more than once
        //OR we can make all of the filter map reduce in the one line
        int response = list.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
        System.out.println(response);
    }
}
