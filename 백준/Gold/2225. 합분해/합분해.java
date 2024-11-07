import java.io.*;

class Main {

    static Long[][] dp;
    
    static long remain = 1_000_000_000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        dp = new Long[N + 1][K + 1];
        for (int i = 1; i <= N; ++i) {
            dp[i][1] = 1L;
        }
        for (int i = 1; i <= K; ++i) {
            dp[1][i] = (long) i;
        }

        recursion(N, K);
        sb.append(dp[N][K]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long recursion(int n, int k) {
        if (dp[n][k] == null) {
            dp[n][k] = ((recursion(n - 1, k) % remain) + (recursion(n, k - 1) % remain)) % remain;
        }
        return dp[n][k];
    }
}