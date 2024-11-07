import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, K;

    static Integer dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");

        N = Integer.parseInt(strArr[0]);
        K = Integer.parseInt(strArr[1]);
        dp = new Integer[150001];
        dp[N] = 0;

        sb.append(bfs(N));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int bfs(int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n, 0});
        while (!queue.isEmpty()) {
            if (dp[K] != null) {
                break;
            }
            int[] poll = queue.poll();
            if (poll[0] != 0) {
                if (dp[poll[0] - 1] == null) {
                    dp[poll[0] - 1] = poll[1] + 1;
                    queue.offer(new int[]{poll[0] - 1, poll[1] + 1});
                }
                if (poll[0] <= 75000 && poll[0] < K) {
                    if (dp[poll[0] * 2] == null) {
                        dp[poll[0] * 2] = poll[1] + 1;
                        queue.offer(new int[]{poll[0] * 2, poll[1] + 1});
                    }
                }
            }
            if (poll[0] < K) {
                if (dp[poll[0] + 1] == null) {
                    dp[poll[0] + 1] = poll[1] + 1;
                    queue.offer(new int[]{poll[0] + 1, poll[1] + 1});
                }
            }
        }
        return dp[K];
    }
}