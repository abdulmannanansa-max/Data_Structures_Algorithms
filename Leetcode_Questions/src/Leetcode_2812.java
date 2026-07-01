import java.util.*;
/*
HARDEST PROBLEM I CAME ACROSS
REVISIT AGAIN 💀☠️
*/
public class Leetcode_2812 {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        
        // Multi-source BFS to find safeness (distance to nearest thief)
        Queue<int[]> queue = new LinkedList<>();
        int[][] safeness = new int[n][n];
        
        // Initialize: add all thieves to queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.offer(new int[]{i, j});
                    safeness[i][j] = 0;
                } else {
                    safeness[i][j] = -1;
                }
            }
        }
        
        // Multi-source BFS: compute distance to nearest thief
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && safeness[nx][ny] == -1) {
                    safeness[nx][ny] = safeness[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        // If start or end is a thief, return 0
        if (safeness[0][0] == 0 || safeness[n-1][n-1] == 0) {
            return 0;
        }
        
        // Binary search on the answer
        int left = 0, right = 2 * n - 2;
        int result = 0;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canReach(safeness, mid, n)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    private boolean canReach(int[][] safeness, int minSafeness, int n) {
        if (safeness[0][0] < minSafeness) return false;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            
            if (x == n - 1 && y == n - 1) {
                return true;
            }
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && 
                    !visited[nx][ny] && safeness[nx][ny] >= minSafeness) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Leetcode_2812 solution = new Leetcode_2812();
        
        // Test case 1
        List<List<Integer>> grid1 = Arrays.asList(
            Arrays.asList(1, 0, 0),
            Arrays.asList(0, 0, 0),
            Arrays.asList(0, 0, 1)
        );
        System.out.println("Test 1: " + solution.maximumSafenessFactor(grid1)); // Output: 0
        
        // Test case 2
        List<List<Integer>> grid2 = Arrays.asList(
            Arrays.asList(0, 0, 0, 1),
            Arrays.asList(0, 0, 0, 0),
            Arrays.asList(0, 0, 0, 0),
            Arrays.asList(1, 0, 0, 0)
        );
        System.out.println("Test 2: " + solution.maximumSafenessFactor(grid2)); // Output: 2
    }
}
