import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    static int remainTargetNum = 1_000_000_000;

    static Integer[] dp = new Integer[2_000_003];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        dp[999_999] = -1;
        dp[1_000_000] = 0;
        dp[1_000_001] = 1;

        int fibo = extendedFibonacci(N + 1_000_000);
        if (N == 0) {
            sb.append("0\n");
        } else if (N % 2 == 0 && N < 0) {
            sb.append("-1\n");
        } else {
            sb.append("1\n");
        }
        sb.append(Math.abs(fibo));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int extendedFibonacci(int n) {
        if (dp[n] != null) {
            return dp[n];
        }
        if (n < 1_000_000) {
            dp[n] = ((extendedFibonacci(n + 2) % remainTargetNum) - (extendedFibonacci(n + 1) % remainTargetNum)) % remainTargetNum;
        } else {
            dp[n] = ((extendedFibonacci(n - 1) % remainTargetNum) + (extendedFibonacci(n - 2) % remainTargetNum)) % remainTargetNum;
        }
        return dp[n];
    }
}