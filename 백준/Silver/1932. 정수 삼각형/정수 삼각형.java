import java.io.*;

class Main {
    
    static Integer[][] dp = new Integer[501][501];
    static int[][] data = new int[501][501];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; ++i) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; ++j) {
                data[i + 1][j + 1] = Integer.parseInt(arr[j]);
            }
        }

        dp[1][1] = data[1][1];

        int max = -1;
        for (int i = 1; i <= N; ++i) {
            max = Math.max(recursion(N, i), max);
        }
        sb.append(max);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    private static int recursion(int n, int index) {
        if (dp[n][index] == null) {
            if (index == 1) {
                dp[n][index] = recursion(n - 1, index) + data[n][index];
            } else if (index == n) {
                dp[n][index] = recursion(n - 1, index - 1) + data[n][index];
            } else {
                dp[n][index] = Math.max(recursion(n - 1, index - 1), recursion(n - 1, index)) + data[n][index];
            }
        }
        return dp[n][index];
    }
}
