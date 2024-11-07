import java.io.*;

class Main {
    static Integer[][] dp = new Integer[1001][3];

    static int[][] data = new int[1001][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            String[] arr = br.readLine().split(" ");
            data[i + 1][0] = Integer.parseInt(arr[0]);
            data[i + 1][1] = Integer.parseInt(arr[1]);
            data[i + 1][2] = Integer.parseInt(arr[2]);
        }
        dp[1][0] = dp[1][1] = dp[1][2] = Integer.MAX_VALUE;

        for (int i = 0; i < 3; ++i) {
            dp[1][i] = data[1][i];
        }
        recursion(N, 0);
        recursion(N, 1);
        recursion(N, 2);

        int min = Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]);

        sb.append(min);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n, int index) {
        if (dp[n][index] == null) {
            if (index == 0) {
                dp[n][0] = Math.min(recursion(n - 1, 1), recursion(n - 1, 2)) + data[n][0];
            } else if (index == 1) {
                dp[n][1] = Math.min(recursion(n - 1, 0), recursion(n - 1, 2)) + data[n][1];
            } else {
                dp[n][2] = Math.min(recursion(n - 1, 0), recursion(n - 1, 1)) + data[n][2];
            }
        }

        return dp[n][index];
    }
}
