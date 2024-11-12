import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, K;

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        K = parseInt(strArr[1]);
        dp = new Integer[200002];
        dp[N] = 0;

        if (N >= K) {
            dp[K] = N - K;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            if (poll > 0) {
                int n = poll;
                while (n <= K) {
                    n *= 2;
                    if (dp[n] == null) {
                        dp[n] = dp[poll];
                        queue.offer(n);
                    }
                }

                int back = poll - 1;
                if (dp[back] == null) {
                    dp[back] = dp[poll] + 1;
                    queue.offer(back);
                }
            }

            if (poll <= K) {
                int front = poll + 1;
                if (dp[front] == null) {
                    dp[front] = dp[poll] + 1;
                    queue.offer(front);
                }
            }

            if (dp[K] != null) {
                break;
            }
        }


        sb.append(dp[K]);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}