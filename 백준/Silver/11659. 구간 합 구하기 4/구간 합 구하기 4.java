import java.io.*;

class Main {

    static int[] dp = new int[100001];

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");

        N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        arr = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i) {
            dp[i] = dp[i - 1] + Integer.parseInt(arr[i - 1]);
        }

        for (int i = 0; i < M; ++i) {
            arr = br.readLine().split(" ");
            int start = Integer.parseInt(arr[0]) - 1;
            int end = Integer.parseInt(arr[1]);
            sb.append(dp[end] - dp[start]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}