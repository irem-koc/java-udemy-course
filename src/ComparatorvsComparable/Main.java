package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else {
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                    if(i%10 >j%10)
                        return 1;
                    else{
                        return -1;
                    }
            }
        };
        Comparator<Student> comparatorByAge = ( i,  j) -> i.age > j.age ? 1: -1;
        List<Integer> nums = new ArrayList<>();
        nums.add(71);
        nums.add(25);
        nums.add(3);
        nums.add(41);
        nums.add(5);
        Collections.sort(nums);
        //if we want to sort by last digit? we should use as second parameter in above code
        Collections.sort(nums, comparator);
//collections work with wrapper classes
        System.out.println(nums);
        List<Student> students = new ArrayList<>();
        students.add(new Student(71, "Bodsfsdb"));
        students.add(new Student(25, "d"));
        students.add(new Student(31, "fdsfsdfsd"));
        System.out.println(students);
        for (Student item: students){
            System.out.println(item.age + " " + item.name );
        }
        Collections.sort(students, comparatorByAge); // sort the students by their age
        Collections.sort(students); // with the help of Comparable interface we can power the classes compare itself with another

        System.out.println(students);
        //TODO: sort the strings of array by the length of the ingredients
//        public int compareTo(Student that) {
//            return this.name.length()>that.name.length()?1:-1;
//        }

    }
}
