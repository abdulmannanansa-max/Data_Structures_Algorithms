public class Leetcode_1358 {
    public static int numberOfSubstrings(String s) {
        int left = 0, right = 0, count = 0, n = s.length();
        int[] map = {0, 0, 0};
        while (right < n) {
            char ch = s.charAt(right);
            map[ch - 'a']++;
            while (map[0] > 0 && map[1] > 0 && map[2] > 0) {
                count += (n-right);
                map[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
}
