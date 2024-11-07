import java.io.*;

class Main {

    static Long[][] dp;
    final static long MOD = 10_007L;

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
        for (int i = 0; i < 10; ++i) {
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
            long sum = 0;
            switch (num) {
                case 0: sum += getCount(digit - 1, 0);
                case 1: sum += getCount(digit - 1, 1);
                case 2: sum += getCount(digit - 1, 2);
                case 3: sum += getCount(digit - 1, 3);
                case 4: sum += getCount(digit - 1, 4);
                case 5: sum += getCount(digit - 1, 5);
                case 6: sum += getCount(digit - 1, 6);
                case 7: sum += getCount(digit - 1, 7);
                case 8: sum += getCount(digit - 1, 8);
                case 9: sum += getCount(digit - 1, 9);
            }
            dp[digit][num] = sum;
        }
        return dp[digit][num] % MOD;
    }
}