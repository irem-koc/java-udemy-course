package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John Doe", "Jane Doe");
//        List<String> uNames = names.stream().map((i)->i.toUpperCase()).toList();//  instead we can use method reference
        List<String> uNames = names.stream().map(String::toUpperCase).toList();// this uppercase method belongs to String class
        uNames.forEach(System.out::println);
        System.out.println(uNames);
    }
}
