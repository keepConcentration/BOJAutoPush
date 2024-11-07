import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  static int N;

  static int[][] map;
  static boolean[][] visitedArr;
  static int min = Integer.MAX_VALUE;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    N = Integer.parseInt(br.readLine());
    map = new int[N][N];
    visitedArr = new boolean[N][N];

    for (int i = 0; i < N; ++i) {
      String[] arr = br.readLine().split(" ");
      for (int j = 0; j < N; ++j) {
        map[i][j] = Integer.parseInt(arr[j]);
      }
    }

    labeling();

    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < N; ++j) {
        if (map[i][j] > 1) {
          bfs(i, j);
        }

      }
    }
    sb.append(min);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static void bfs(int x, int y) {
    Queue<int[]> queue = new LinkedList<>();
    int label = map[x][y];
    queue.offer(new int[]{x, y, 0});
    visitedArr = new boolean[N][N];
    visitedArr[x][y] = true;

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    while (!queue.isEmpty()) {
      int[] poll = queue.poll();
      int currentX = poll[0];
      int currentY = poll[1];
      int count = poll[2];

      if (map[currentX][currentY] != label && map[currentX][currentY] != 0) {
        min = Math.min(min, count);
        return;
      }
      if (count > min) {
        return;
      }

      for (int i = 0; i < 4; ++i) {
        int nextX = currentX + dx[i];
        int nextY = currentY + dy[i];
        if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
          int nextIsland = map[nextX][nextY];
          if (visitedArr[nextX][nextY]) {
            continue;
          }
          // 다른 섬 도착
          if (nextIsland != 0 && nextIsland != label) {
            if (min > count) {
              min = count;
            } else {
              continue;
            }
          } else if (nextIsland == 0) {
            visitedArr[nextX][nextY] = true;
            queue.offer(new int[]{nextX, nextY, count + 1});
          }
        }
      }
    }
  }

  private static void labeling() {
    int label = 2;
    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < N; ++j) {
        if (map[i][j] == 1) {
          labelingBfs(i, j, label++);
        }
      }
    }
  }

  private static void labelingBfs(int x, int y, int label) {
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{x, y});
    map[x][y] = label;

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    while (!queue.isEmpty()) {
      int[] poll = queue.poll();
      int currentX = poll[0];
      int currentY = poll[1];
      if (map[currentX][currentY] == 1) {
        map[currentX][currentY] = label;
      }

      for (int i = 0; i < 4; ++i) {
        int nextX = currentX + dx[i];
        int nextY = currentY + dy[i];
        if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
          int nextVal = map[nextX][nextY];
          if (nextVal == 1) {
            map[nextX][nextY] = label;
            queue.offer(new int[]{nextX, nextY});
          }
        }
      }
    }
  }
}