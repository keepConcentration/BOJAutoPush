import java.io.*;

class Main {

    static Long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp = new Long[N + 1][2];
        dp[1][0] = dp[1][1] = 1L;

        long result = getCount(N, 1);
        sb.append(result);

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
            if (num == 1) {
                dp[digit][num] = getCount(digit - 1, 0);
            } else {
                dp[digit][num] = getCount(digit - 1, 0) + getCount(digit - 1, 1);
            }
        }
        return dp[digit][num];
    }
}