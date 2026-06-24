public class Leetcode_05 {
    public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0;
    int end = 0;

    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);     // Odd length
        int len2 = expandAroundCenter(s, i, i + 1); // Even length
        int len = Math.max(len1, len2);

        if (len > end - start) {
            // Calculate new start and end based on the center i and length len
            start = i - (len - 1) / 2;
            end = i + len / 2;
            }
    }
        // substring end index is exclusive, so we need end + 1
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
