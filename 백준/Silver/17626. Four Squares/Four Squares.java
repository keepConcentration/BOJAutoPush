import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        for (int i = 1; i * i <= N; ++i) {
            dp[i * i] = 1;
        }
        for (int i = 2; i <= N; ++i) {
            if (dp[i] != null) {
                continue;
            }
            dp[i] = dp[i - 1] + 1;
            for (int j = 2; j * j <= i; ++j) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        sb.append(dp[N]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}