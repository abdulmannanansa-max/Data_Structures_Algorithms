import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_1081 {
    public static String smallestSubsequence(String s) {
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }

        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) continue;

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && lastIndex.get(sb.charAt(sb.length() - 1)) > i) {
                seen.remove(sb.charAt(sb.length() - 1));
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            seen.add(c);
        }

        return sb.toString();
    }
}
