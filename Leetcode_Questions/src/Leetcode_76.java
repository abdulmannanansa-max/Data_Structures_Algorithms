import java.util.HashSet;

public class Leetcode_76 {

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashSet<Character> set = new HashSet<>();
        for (char c : t.toCharArray()) {
            set.add(c);
        }

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.contains(c)) {
                set.remove(c);
            }
            right++;

            while (set.isEmpty()) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if (t.indexOf(leftChar) != -1) {
                    set.add(leftChar);
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result); // Output: "BANC"
    }
}
