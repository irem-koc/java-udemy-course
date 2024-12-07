public class Array
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(nums[0]);

        int[] nums1 = new int[4];
        nums1[0] = 4;
        nums1[1] = 11;
        nums1[2] = 9;
        nums1[3] = 6;

        for (int j : nums1) {
            System.out.println(j + " is the value");
        }
    }
}
