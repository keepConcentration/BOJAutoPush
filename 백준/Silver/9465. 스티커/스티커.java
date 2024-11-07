import java.io.*;

class Main {

    static int[][] dp;
    static int[][] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            dp = new int[2][N + 1];
            data = new int[2][N + 1];

            for (int i = 0; i < 2; ++i) {
                String[] arr = br.readLine().split(" ");
                for (int j = 1; j <= N; ++j) {
                    data[i][j] = Integer.parseInt(arr[j - 1]);
                }
            }

            dp[0][1] = data[0][1];
            dp[1][1] = data[1][1];

            for (int i = 2; i <= N; ++i) {
                dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + data[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + data[1][i];
            }
            sb.append(Math.max(dp[0][N], dp[1][N])).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}