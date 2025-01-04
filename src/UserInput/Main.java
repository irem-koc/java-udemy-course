package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!"); //println is PrintStream class object
        // out is the static final object of System class

        //Enter a number
        System.out.println("Enter a number: ");
//        int result = System.in.read(); // it gives ASCII version of that value
//        System.out.println("You entered: " + result); // so we should - 48 by result for each char :/
        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // br is the resource so we should close it after use it
        int number = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + number);
        br.close();

        // or we can use Scanner class
        System.out.println("Enter a number: ");

        Scanner sca = new Scanner(System.in);
        int number2 = sca.nextInt();
        System.out.println("You entered: " + number2);

    }
}
