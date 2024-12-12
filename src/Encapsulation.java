class Human{
//    String name;
//    int age;
    private String name; //instance variable - heap
    private int age;

    //constructor'a özel olacak şekilde type belirtmeye gerek yoktur ve fonksiyon ismi class ismi le aynı olmalıdır.
    //constructor never returns anything
    //everytime you create the object the constructor is called


    public Human(){ //default constructor, oluşturulmasa da java tarafında default değerler ile oluşturuluyor
        System.out.println("in constructor");
        name = "irem";
        age = 22;
    }
    public Human(String name, int age){ //parameterized constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //local variable - stack
        //this bu metodu çağıran objecti refere eder
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public int getAge(){
//        //getAge ifadesi yerine abc de yazılabilir ama aıklayıcı olmaz o yüzden tercih edilmez.
//        return age;
//    }
//    public void setAge(int ageValue){
//        age = ageValue;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String nameValue){
//        name = nameValue;
//    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        //human ilk başta oluşturulduğunda değerleri heap'te name null ve age 0 olarak boş obje halinde tutulur
//        human.setName("John");
//        human.setAge(20);
//        human.name = "irem";
//        human.age = 18;
        // classlara dışarıdan direkt müdahale edilmemek istenir, bu nedenle de private kullanılabilir. Private değişkenler
        // veya fonksiyonlar yalnızca declare edildiği sınıflarda kullanılabilir. Tanımlanan sınıflardaki değişkenlere
        //instance variable denir.
        System.out.println(human.getName() + " is "+ human.getAge() + " year's old." );
    }
}
