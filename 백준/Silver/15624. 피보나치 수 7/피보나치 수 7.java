import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    static int remainTargetNum = 1_000_000_007;

    static Integer[] dp = new Integer[1_000_001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp[0] = 0;
        dp[1] = 1;

        sb.append(remainedFibonacci(N));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int remainedFibonacci(int n) {

        if (dp[n] != null) {
            return dp[n];
        }
        dp[n] = ((remainedFibonacci(n - 1) % remainTargetNum) + (remainedFibonacci(n - 2) % remainTargetNum)) % remainTargetNum;

        return dp[n];
    }

}