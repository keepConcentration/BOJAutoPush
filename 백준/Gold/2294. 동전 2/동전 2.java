import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;

    static Integer[] dp;

    static int[] coins;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        int K = parseInt(strArr[1]);
        coins = new int[N];
        dp = new Integer[100001];
        for (int i = 0; i < N; ++i) {
            coins[i] = parseInt(br.readLine());
            dp[coins[i]] = 1;
        }

        dp[0] = 0;
        for (int i = 1; i <= K; ++i) {
            for (int j = 0; j < N; ++j) {
                if (i < coins[j]) {
                    continue;
                }
                if (dp[i - coins[j]] == null) {
                    continue;
                }
                if (dp[i] == null) {
                    dp[i] = dp[i - coins[j]] + 1;
                } else {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if (dp[K] == null) {
            sb.append("-1\n");
        } else {
            sb.append(dp[K]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
