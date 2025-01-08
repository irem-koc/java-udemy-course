package ConstructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private final String namee;
    {
        namee = "John";
    }
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John Doe", "Jane Doe"); //If we want to create object for each name
        List<Student> students = new ArrayList<>();
//        for (String name : names) {
//            students.add(new Student(name));
//        }
        //or we can do it in stream api
//        students = names.stream().map(s -> new Student(s)).toList();
        students = names.stream().map(Student::new).toList(); //with constructor reference Object-operator
        System.out.println(students);
    }
}
