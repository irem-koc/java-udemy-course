
public class LearnString {
    public static void main(String[] args) {
//        String name = "irem";
        String name = "irem";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" koc"));

        String firstName = "irem";
        //StringBuffer thread safety and StringBuilder not thread safety's are mutable String
        StringBuffer sb = new StringBuffer(firstName);
        sb.append(" Koç");
        sb.insert(4, "I");
        System.out.println(sb);
    }
}
