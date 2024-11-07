import java.io.*;

class Main {

    static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dp = new Long[101];
        dp[0] = 0L;
        dp[1] = dp[2] = dp[3] = 1L;
        dp[4] = 2L;

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(recursion(N)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long recursion(int n) {
        if (dp[n] == null) {
            dp[n] = recursion(n - 1) + recursion(n - 5);
        }
        return dp[n];
    }
}