//JUMP GAME II
public class Leetcode_45 {
    public static int jump(int[] nums){
        if (nums.length == 1) return 0;
        int maxEndJump=0, currEndJump=0, jumps=0;
        for (int i=0 ; i<nums.length-1 ; i++){
            maxEndJump = Math.max(maxEndJump, i+nums[i]);
            if (i == currEndJump){
                jumps += 1;
                currEndJump = maxEndJump;
            }
            if(currEndJump >= nums.length-1) break;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
