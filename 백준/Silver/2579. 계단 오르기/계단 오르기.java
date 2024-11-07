import java.io.*;

class Main {

    static Integer[] dp;

    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[301];
        data = new int[301];

        dp[0] = 0;
        data[0] = 0;
        for (int i = 1; i <= N; ++i) {
            data[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = data[1];
        if (N >= 2) {
            dp[2] = data[1] + data[2];
        }
        recursion(N);

        sb.append(dp[N]).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(recursion(n - 2), recursion(n - 3) + data[n - 1]) + data[n];
        }
        return dp[n];
    }
}