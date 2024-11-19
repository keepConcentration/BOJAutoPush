import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[] coins;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        int K = parseInt(strArr[1]);

        coins = new int[N];
        for (int i = 0; i < N; ++i) {
            coins[i] = parseInt(br.readLine());
        }
        dp = new int[K + 1];
        dp[0] = 1;

        for (int j = 0; j < N; ++j) {
            for (int i = 1; i <= K; ++i) {
                if (i < coins[j]) {
                    continue;
                }
                dp[i] = dp[i - coins[j]] + dp[i];
            }
        }
        sb.append(dp[K]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
