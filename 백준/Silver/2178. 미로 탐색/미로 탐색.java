import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  static int N, M;

  static int[][] maze;
  static int[][] visitedArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    String[] arr = br.readLine().split(" ");
    N = Integer.parseInt(arr[0]);
    M = Integer.parseInt(arr[1]);
    maze = new int[N][M];
    visitedArr = new int[N][M];

    for (int i = 0; i < N; ++i) {
      arr = br.readLine().split("");
      for (int j = 0; j < M; ++j) {
        maze[i][j] = Integer.parseInt(arr[j]);
      }
    }

    bfs();
    sb.append(visitedArr[N - 1][M - 1]);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static void bfs() {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    visitedArr[0][0] = 1;

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    while (!queue.isEmpty()) {
      int[] arr = queue.poll();
      int x = arr[0];
      int y = arr[1];

      for (int i = 0; i < 4; ++i) {
        if (x + dx[i] >= 0 && x + dx[i] < N && y + dy[i] >= 0 && y + dy[i] < M) {
          if (maze[x + dx[i]][y + dy[i]] == 1 && visitedArr[x + dx[i]][y + dy[i]] == 0) {
            visitedArr[x + dx[i]][y + dy[i]] = visitedArr[x][y] + 1;
            queue.add(new int[]{x + dx[i], y + dy[i]});
          }
        }
      }
    }
  }
}