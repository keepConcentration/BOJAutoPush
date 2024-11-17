import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

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

    long result = 0;
    if (N >= K) {
      dp[K] = N - K;
      result = 1;
    } else {
      Queue<int[]> queue = new LinkedList<>();
      queue.offer(new int[]{N, 0});
      while (!queue.isEmpty()) {
        int[] poll = queue.poll();
        int node = poll[0];
        int count = poll[1];
        if (dp[K] != null) {
          if (count > dp[K]) {
            continue;
          } else if (K == node) {
            result++;
            continue;
          }
        } else if (K == node) {
          dp[K] = count;
          result++;
          continue;
        }

        if (dp[node] != null) {
          if (dp[node] < count) {
            continue;
          }
          dp[node] = Math.min(count, dp[node]);
        } else {
          dp[node] = count;
        }

        if (node <= K) {
          queue.offer(new int[]{node + 1, count + 1});
          queue.offer(new int[]{node * 2, count + 1});
        }
        if (node > 0) {
          queue.offer(new int[]{node - 1, count + 1});
        }
      }
    }

    sb.append(dp[K]).append("\n").append(result);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}