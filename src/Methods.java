class Computer{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public String getMeAPen(int cost){
        if(cost>=10){
            return "Pen";
        }
        return "Nothing";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.playMusic();
        String pen = computer.getMeAPen(5);
        System.out.println(pen+ " is the output");
    }
}
