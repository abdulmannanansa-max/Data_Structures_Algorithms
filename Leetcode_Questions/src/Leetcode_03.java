import java.util.HashSet;

public class Leetcode_03 {
    public static int length_of_longest_substring(String s){
        int left = 0, maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0 ; right < s.length() ; right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(length_of_longest_substring(s));
    }
}
