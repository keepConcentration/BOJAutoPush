import java.io.*;

class Main {

    static Integer[] dp;
    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        data = new int[N + 1];
        data[0] = Integer.MIN_VALUE;

        String[] arr = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i) {
            data[i] = Integer.parseInt(arr[i - 1]);
        }
        for (int i = 1; i <= N; ++i) {
            recursion(i);
        }

        int max = dp[1];
        for (int i = 2; i <= N; ++i) {
            max = Math.max(max, dp[i]);
        }

        sb.append(max).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = 1;
            for (int i = n - 1; i > 0; --i) {
                if (data[n] < data[i]) {
                    dp[n] = Math.max(dp[n], recursion(i) + 1);
                }
            }
        }
        return dp[n];
    }
}