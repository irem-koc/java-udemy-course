package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithResources {
    public static void main(String[] args) throws IOException {
        int i =0;
        int j =0;
        try{
            j= 18/i;
            System.out.println("bye");
        } catch (Exception e) {
            System.out.println("bye");
            System.out.println("something went wrong");
        }finally{ // irrespective if we get exception or not finally execute the final block
            System.out.println("finally");
        }
        // in the normal world we can use try with finally
        int num =0;
        BufferedReader br=null;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
//            br= new BufferedReader(isr);
            br= new BufferedReader(new InputStreamReader(System.in)); //or
            num = Integer.parseInt(br.readLine());
            System.out.println(num + " entered number");
        }finally { // this block is used to close the resource
            br.close();
        }
        //or we can use try with resources
        try(BufferedReader brr= new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(brr.readLine());
            System.out.println(num + " entered number");
        }

    }
}
