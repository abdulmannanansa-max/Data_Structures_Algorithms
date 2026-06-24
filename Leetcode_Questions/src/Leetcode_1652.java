public class Leetcode_1652 {
    public static int[] decrypt(int[] code, int k){
        int sum;
        for (int i = 0; i < code.length; i++) {
            sum = 0;
            if (k > 0) {
                for (int j = i + 1; j < k; j++) {
                    sum += code[j];
                }
            }else if (k < 0) {
                for (int j = i + 1; j < -k; j++) {
                    sum += code[j];
                }
            }
            code[i] = sum;
        }
        return code;
    }
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        System.out.println(decrypt(code, 3));
    }
}
