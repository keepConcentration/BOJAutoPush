import java.io.*;

class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[100001];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= N; ++i) {
            dp[i] = i;
            for (int j = 1; j * j <= i; ++j) {
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }

        sb.append(dp[N]).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}