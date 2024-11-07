import java.io.*;

class Main {

    static Integer[] dp;

    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        dp = new Integer[N + 1];
        data = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            data[i] = Integer.parseInt(arr[i - 1]);
        }
        dp[1] = data[1];
        sb.append(recursion(N));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = data[n];
            for (int i = n - 1; i > 0; --i) {
                dp[n] = Math.max(dp[n], data[i] + recursion(n - i));
            }
        }
        return dp[n];
    }
}
