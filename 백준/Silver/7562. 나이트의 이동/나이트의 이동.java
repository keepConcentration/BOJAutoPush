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

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = parseInt(br.readLine());
    t:
    while (T-- > 0) {
      int N = parseInt(br.readLine());
      Integer[][] dp = new Integer[N][N];
      String[] strArr = br.readLine().split(" ");
      int startY = parseInt(strArr[0]);
      int startX = parseInt(strArr[1]);
      dp[startY][startX] = 0;
      strArr = br.readLine().split(" ");
      int endY = parseInt(strArr[0]);
      int endX = parseInt(strArr[1]);
      if (startY == endY && startX == endX) {
        sb.append("0\n");
        continue t;
      }

      int[] dy = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
      int[] dx = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};

      Queue<int[]> queue = new LinkedList<>();
      queue.offer(new int[]{startY, startX, 0});

      while (!queue.isEmpty()) {
        int[] poll = queue.poll();
        int count = poll[2];
        dp[poll[0]][poll[1]] = count;
        for (int i = 0; i < 8; ++i) {
          int nextY = poll[0] + dy[i];
          int nextX = poll[1] + dx[i];
          if (nextY < 0 || nextY >= N ||
              nextX < 0 || nextX >= N) {
            continue;
          }
          if (dp[nextY][nextX] != null) {
            continue;
          }
          if (nextY == endY && nextX == endX) {
            sb.append(count + 1).append("\n");
            continue t;
          }
          dp[nextY][nextX] = count + 1;
          queue.offer(new int[]{nextY, nextX, count + 1});
        }
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

}
