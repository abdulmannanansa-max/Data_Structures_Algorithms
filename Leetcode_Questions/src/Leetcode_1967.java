public class Leetcode_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Leetcode_1967 solution = new Leetcode_1967();
        String[] patterns = {"a", "abc", "bc"};
        String word = "abc";
        int result = solution.numOfStrings(patterns, word);
        System.out.println(result); // Output: 3
    }
}
