import java.io.*;

class Main {

    static int[] dp;
    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        data = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            data[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = data[1];

        if (N >= 2) {
            dp[2] = data[1] + data[2];
        }
        if (N >= 3) {
            dp[3] = Math.max(Math.max(data[1] + data[2], data[1] + data[3]), data[2] + data[3]);
        }
        for (int i = 4; i <= N; ++i) {
            dp[i] = Math.max(Math.max(dp[i - 2], dp[i - 3] + data[i - 1]) + data[i], dp[i - 1]);
        }
        sb.append(dp[N]).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}