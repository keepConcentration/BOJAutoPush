import java.io.*;

class Main {

    static long[] dp;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");

        N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);

        dp = new long[N + 1];

        arr = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i) {
            dp[i] = dp[i - 1] + Long.parseLong(arr[i - 1]);
        }

        long max = Long.MIN_VALUE;
        for (int i = K; i <= N; ++i) {
            max = Math.max(max, dp[i] - dp[i - K]);
        }

        sb.append(max);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}