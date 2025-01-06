package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>(); //Hashtable can be used as HashMap in a synchronized way
        studentMarks.put("John Doe", 1);
        studentMarks.put("Jasne Doe", 2);
        studentMarks.put("Jack Doe", 3);
        studentMarks.put("Jane Doe", 4);studentMarks.put("Jasnesd Doe", 2);
        studentMarks.put("Jdsack Doe", 3);
        studentMarks.put("Jdsane Doe", 4);
        System.out.println(studentMarks); //not the same order that we enter
        System.out.println(studentMarks.get("John Doe"));
        studentMarks.put("John Doe", 5);
        System.out.println(studentMarks.entrySet());
        System.out.println(studentMarks.keySet());
        System.out.println(studentMarks.values());
        for (String key : studentMarks.keySet()){
            System.out.println(studentMarks.get(key));
        }
    }
}
