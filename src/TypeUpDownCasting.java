class People{
    public void show(){
        System.out.println("in people class");
    }
}
class IntelligentPeople extends People{
    public void show2(){
        System.out.println("in IntelligentPeople class");
    }
}
public class TypeUpDownCasting {
    public static void main(String[] args) {
        double d = 4.5;
//        int i = d; //diyemeyiz
        int i = (int) d; //it is a type casting
//        People p = new People();
        People p = (People) new IntelligentPeople();//it is upcasting
        p.show();
        People p2 = new People();

        IntelligentPeople ip = (IntelligentPeople) p; //it is downcasting
//        IntelligentPeople ip2 = (IntelligentPeople) p2; //it is not  downcasting p2 IntelligentPeople sınıfından değil sadece People' aait People sınıfı IntelligentPeople sınıfından haberdar değildir.
        ip.show2();
//        ip2.show2();


    }

}
