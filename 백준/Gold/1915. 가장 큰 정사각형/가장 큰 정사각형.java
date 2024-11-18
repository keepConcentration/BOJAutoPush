import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[][] map;

    static Integer[][] dp;

    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);
        dp = new Integer[N + 1][M + 1];
        map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; ++i) {
            strArr = br.readLine().split("");
            for (int j = 1; j <= M; ++j) {
                map[i][j] = parseInt(strArr[j - 1]);
            }
        }

        dp(N, M);
        sb.append(result * result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int dp(int n, int m) {
        if (n == 1 || m == 1) {
            dp[n][m] = map[n][m];
            result = Math.max(result, dp[n][m]);
        } else if (dp[n][m] == null) {
            dp[n][m] = Math.min(Math.min(dp(n - 1, m), dp(n, m - 1)), dp(n - 1, m - 1)) + 1;
            if (map[n][m] == 0) {
                dp[n][m] = 0;
            }
            result = Math.max(result, dp[n][m]);
        }
        return dp[n][m];
    }
}
