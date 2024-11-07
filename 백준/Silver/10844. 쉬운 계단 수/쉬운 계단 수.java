import java.io.*;

class Main {

    static Long[][] dp;
    final static long MOD = 1_000_000_000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp = new Long[N + 1][10];

        for (int i = 0; i < 10; ++i) {
            dp[1][i] = 1L;
        }

        long result = 0;
        for (int i = 1; i < 10; ++i) {
            result += getCount(N, i);
        }
        sb.append(result % MOD);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long getCount(int digit, int num) {
        if (digit == 1) {
            return dp[digit][num];
        }

        if (dp[digit][num] == null) {
            if (num == 0) {
                dp[digit][num] = getCount(digit - 1, 1);
            } else if (num == 9) {
                dp[digit][num] = getCount(digit - 1, 8);
            } else {
                dp[digit][num] = getCount(digit - 1, num - 1) + getCount(digit - 1, num + 1);
            }
        }
        return dp[digit][num] % MOD;
    }
}