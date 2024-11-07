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

  static Integer[] dp = new Integer[101];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strArr = br.readLine().split(" ");
    int N = parseInt(strArr[0]);
    int M = parseInt(strArr[1]);
    int[][] ladderAndSnakes = new int[N + M][2];
    for (int i = 0; i < N + M; ++i) {
      strArr = br.readLine().split(" ");
      ladderAndSnakes[i][0] = parseInt(strArr[0]);
      ladderAndSnakes[i][1] = parseInt(strArr[1]);
    }

    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{1, 0});
    dp[1] = 0;

    int[] dice = new int[]{1, 2, 3, 4, 5, 6};

    l:
    while (!queue.isEmpty()) {
      int[] poll = queue.poll();
      int currentIndex = poll[0];
      int currentCount = poll[1];

      for (int i = 0; i < 6; ++i) {
        int nextIndex = currentIndex + dice[i];
        for (int j = 0; j < N + M; ++j) {
          if (nextIndex == ladderAndSnakes[j][0]) {
            nextIndex = ladderAndSnakes[j][1];
            break;
          }
        }
        if (nextIndex < 1 || nextIndex > 100) {
          continue;
        }
        if (dp[nextIndex] != null) {
          continue;
        }
        if (nextIndex == 100) {
          sb.append(currentCount + 1);
          break l;
        }
        dp[nextIndex] = currentCount + 1;
        queue.offer(new int[]{nextIndex, currentCount + 1});
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
