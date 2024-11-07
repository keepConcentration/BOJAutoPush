import java.io.*;

class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        sb.append(getCount(N));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getCount(int n) {
        if (dp[n] != null) {
            return dp[n];
        }
        if (dp[n - 1] == null) {
            dp[n - 1] = getCount(n - 1);
        }
        if (dp[n - 2] == null) {
            dp[n - 2] = getCount(n - 2);
        }
        dp[n] = ((dp[n - 1] % 10007) + (dp[n - 2] % 10007)) % 10007;
        return dp[n];
    }
}