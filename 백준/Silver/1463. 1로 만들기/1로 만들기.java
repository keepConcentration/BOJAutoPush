import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        br.close();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        sb.append(compute(N));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int compute(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(compute(n / 3), Math.min(compute(n / 2), compute(n - 1))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(compute(n / 3), compute(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(compute(n / 2), compute(n - 1)) + 1;
            } else {
                dp[n] = compute(n - 1) + 1;
            }
        }
        return dp[n];
    }
}