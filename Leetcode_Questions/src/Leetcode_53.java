public class Leetcode_53 {
    public static int maxSubArray(int[] nums){
        int sum = 0, ans = nums[0];
        for (int i : nums) {
            sum += i;
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
