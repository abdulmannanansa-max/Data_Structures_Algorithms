public class Leetcode_2269 {
    public static int divisorSubstrings(int num, int k) {
        String numstr = Integer.toString(num);
        int count = 0;
        for (int i = 0 ; i < numstr.length() - k + 1; i++) {
            String substring = numstr.substring(i, i + k);
            int subnum = Integer.parseInt(substring);
            if (subnum != 0 && num % subnum == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        int result = divisorSubstrings(num, k);
        System.out.println(result); // Output: 2
    }
}
