package StreamApi;

import java.util.function.Function;
import java.util.function.Predicate;
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

        List<Integer> liste = Arrays.asList(4,5,2,3,323,1,22); // way of making list
        Predicate<Integer> p = n -> n%2==0;
        Function<Integer,Integer> f = n -> n*2; //<Accepts: Integer, Returns: Integer>
        int responsee = list.stream().filter(p).map(f).reduce(0, (c,e)->c+e);
        System.out.println(responsee);
        Stream<Integer> sorted= liste.stream().filter(p).map(f).sorted();
        sorted.forEach(a->System.out.println(a));
    }
}
