import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
//SIMILAR TO Leetcode_2812
public class Leetcode_3286 {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[][] maxHealth = new int[n][m];

        health -= grid.get(0).get(0);
        if (health <= 0) {
            return false;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, health});
        maxHealth[0][0] = health;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int h = curr[2];

            if (x == n - 1 && y == m - 1) {
                return true;
            }

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    int newHealth = h - grid.get(nx).get(ny);
                    
                    if (newHealth > 0 && newHealth > maxHealth[nx][ny]) {
                        maxHealth[nx][ny] = newHealth;
                        queue.offer(new int[]{nx, ny, newHealth});
                    }
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Leetcode_3286 solution = new Leetcode_3286();
        List<List<Integer>> grid = List.of(
            List.of(0, 0, 1),
            List.of(1, 0, 0),
            List.of(0, 1, 0)
        );
        int health = 2;
        boolean result = solution.findSafeWalk(grid, health);
        System.out.println(result); // Output: true
    }
}
