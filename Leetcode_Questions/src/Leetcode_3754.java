public class Leetcode_3754 {
    public static long sumAndMultiply(int n){
        // Approach too Complicated
        if(n == 0) return 0;
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.getNumericValue(ch) != 0){
                sb.append(ch);
                x += Character.getNumericValue(ch);
            }
        }
        return x * Long.parseLong(sb.toString());

//        More optimized approach
//        int x=0;
//        int sum=0;
//        int i=1;
//        while(n>0){
//            int m=n % 10;
//            n /=10;
//            if(m == 0) continue;
//            sum += m;
//            x += (m * i);
//            i *=10;
//        }
//        return (long) x * sum;
    }
    public static void main(String[] args) {
        int n = 123405;
        System.out.println(sumAndMultiply(n));
    }
}
