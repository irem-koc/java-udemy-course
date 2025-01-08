package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(100));
        }

//        int sum1 = nums.stream().map((a)->a*2).reduce(0, (c,e)-> c+e);
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream().map((a)-> {
            try{
                Thread.sleep(1);
            } catch (Exception e) {
            }
           return a * 2;
        }).mapToInt(i -> i).sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream().map((a)-> { //independent works used.
            try{
                Thread.sleep(1);
            } catch (Exception e) {
            }
            return a * 2;
        }).mapToInt(i -> i).sum();
        long endPara = System.currentTimeMillis();

        System.out.println("Seq " + (endSeq - startSeq) + "ms");
        System.out.println("Para " + (endPara -startPara) + "ms");

        System.out.println(sum2 + " " + sum3);
    }
}
