public class Leetcode_28 {
    public static int strStr(String haystack, String needle){
        int i = 0, j = 0;
        while (j < needle.length()){
            if (haystack.indexOf(i) == needle.indexOf(j)) {
                j++;
            }
            else if (haystack.indexOf(i) != needle.indexOf(j)) {
                i -= j;
                j = 0;
            }
            if (needle.length() == j) return i -= j - 1;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
