public class Leetcode_27 {
    public static int removeDuplicates(int[] nums, int val){
        int insertPos = 0;
        for (int num: nums){
            if (num != val) {
                nums[insertPos++] = val;
            }
        }
        return insertPos;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        System.out.println(removeDuplicates(nums, 2));
    }
}
