public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[1];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[6];

        for (int[] ints : jaggedArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int[][][] threeDimensionArray = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDimensionArray[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        for (int[][] i : threeDimensionArray) {
            for (int[] j: i){
                for (int k: j){
                    System.out.print(k + " ");
                }
            }
            System.out.println("*");
        }
    }
}
