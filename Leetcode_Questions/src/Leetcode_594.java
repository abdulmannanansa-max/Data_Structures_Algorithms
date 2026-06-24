import java.util.HashMap;

public class Leetcode_594 {
    public static int findLHS(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.containsKey(nums[i] + 1)) {
                     maxlen = Math.max(maxlen, map.get(nums[i]) + map.get(nums[i] + 1));
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
