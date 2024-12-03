import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static Integer[][] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        N = parseInt(br.readLine());
        dp = new Integer[100001][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        dp(N, 0);
        dp(N, 1);
        dp(N, 2);

        sb.append((dp[N][0] + dp[N][1] + dp[N][2]) % 9901).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static Integer dp(int n, int m) {
        if (dp[n][m] == null) {
            if (m == 0) {
                dp[n][m] = dp(n - 1, 0) + dp(n - 1, 1) + dp(n - 1, 2);
            } else if (m == 1) {
                dp[n][m] = dp(n - 1, 0) + dp(n - 1, 2);
            } else {
                dp[n][m] = dp(n - 1, 0) + dp(n - 1, 1);
            }
        }
        return dp[n][m] % 9901;
    }
}
