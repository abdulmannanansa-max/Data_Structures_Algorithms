public class Leetcode_76 {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int left = 0, right = 0, minLeft = 0, minLen = Integer.MAX_VALUE, count = 0;
        while (right < s.length()) {
            char cRight = s.charAt(right);
            if (tFreq[cRight] > 0) {
                count++;
            }
            tFreq[cRight]--;
            right++;

            while (count == t.length()) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }
                char cLeft = s.charAt(left);
                tFreq[cLeft]++;
                if (tFreq[cLeft] > 0) {
                    count--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result); // Output: "BANC"
    }
}
