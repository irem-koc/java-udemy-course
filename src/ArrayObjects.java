class Student{
    int schoolNo;
    String name;
}
public class ArrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.schoolNo = 101;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.schoolNo = 102;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for(Student student : students){
            System.out.println(student.name +" is the name");
        }
    }
}
