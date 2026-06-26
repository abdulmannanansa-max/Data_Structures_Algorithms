/*VERY IMPORTANT QUESTION
JUMP GAME*/
public class Leetcode_55 {
    public static boolean canJump(int[] nums){
        int goal = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--)
            if (i + nums[i] >= goal) goal = i;
        return goal == 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
