import java.util.Arrays;
import java.util.List;

public class Leetcode_1301 {
    public static int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int[][] dp = new int[n][n];
        int[][] count = new int[n][n];
        final int MOD = 1000000007;
        dp[n - 1][n - 1] = 0;
        count[n - 1][n - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (board.get(i).charAt(j) == 'X') continue;
                if (i == n - 1 && j == n - 1) continue;

                int maxScore = -1;
                int pathCount = 0;

                // Check down
                if (i + 1 < n && board.get(i + 1).charAt(j) != 'X' && count[i + 1][j] > 0) {
                    if (dp[i + 1][j] > maxScore) {
                        maxScore = dp[i + 1][j];
                        pathCount = count[i + 1][j];
                    } else if (dp[i + 1][j] == maxScore) {
                        pathCount = (pathCount + count[i + 1][j]) % MOD;
                    }
                }

                // Check right
                if (j + 1 < n && board.get(i).charAt(j + 1) != 'X' && count[i][j + 1] > 0) {
                    if (dp[i][j + 1] > maxScore) {
                        maxScore = dp[i][j + 1];
                        pathCount = count[i][j + 1];
                    } else if (dp[i][j + 1] == maxScore) {
                        pathCount = (pathCount + count[i][j + 1]) % MOD;
                    }
                }

                // Check diagonal
                if (i + 1 < n && j + 1 < n && board.get(i + 1).charAt(j + 1) != 'X' && count[i + 1][j + 1] > 0) {
                    if (dp[i + 1][j + 1] > maxScore) {
                        maxScore = dp[i + 1][j + 1];
                        pathCount = count[i + 1][j + 1];
                    } else if (dp[i + 1][j + 1] == maxScore) {
                        pathCount = (pathCount + count[i + 1][j + 1]) % MOD;
                    }
                }

                if (maxScore != -1) {
                    char ch = board.get(i).charAt(j);
                    int val = (ch >= '0' && ch <= '9') ? (ch - '0') : 0; // treat 'E' and 'S' (and others) as 0
                    dp[i][j] = maxScore + val;
                    count[i][j] = pathCount % MOD;
                }
            }
        }

        return new int[]{dp[0][0], count[0][0]};
    }

    public static void main(String[] args) {
        List<String> board = Arrays.asList("E23", "2X2", "12S");
        int[] result = pathsWithMaxScore(board);
        System.out.println(Arrays.toString(result)); // Output: [7, 1]
    }
}
