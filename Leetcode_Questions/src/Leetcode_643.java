public class Leetcode_643 {
    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        double max_sum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i] + nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum/k;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
