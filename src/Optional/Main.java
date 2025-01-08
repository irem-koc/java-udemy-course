package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("İrsam", "Murat", "Furkan", "Mt");

        Optional<String> name = names.stream().filter((a)->a.contains("e")).findFirst(); // null pointer exception
        // if we dont have any name which has e?
//        System.out.println(name.get());// it can throw java.util.NoSuchElementException
        System.out.println(name.orElse("not found"));// if you found the name print or print this

    }
}
