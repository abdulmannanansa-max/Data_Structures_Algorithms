import java.util.HashSet;
import java.util.Set;

class solution {
    public int countTriples(int n) {
        Set<Float> set = new HashSet<>();
        int count = 0;
        for(float i = 1 ; i <= n ; i++){
            set.add(i);
        }
        for(float i = 1 ; i <= n ; i++){
            float num = (i*i) + (i+1)*(i+1);
            float sq_num = (float) Math.sqrt(num);
            if(set.contains(sq_num)){
                count++;
            }
        }
        for(float i = n ; i >= 1 ; i--){
            float num = (i*i) + (i-1)*(i-1);
            float sq_num = (float) Math.sqrt(num);
            if(set.contains(sq_num)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.countTriples(5));
    }
}