import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
  static int N, K;
  static int T;
  static StringBuilder sb = new StringBuilder();
  static List<Integer>[] adjacentNodeListArr;

  static int[] timeArr;
  static int[] edgeArr;

  static Integer[] minTimeArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      String[] arr = br.readLine().split(" ");
      N = Integer.parseInt(arr[0]);
      K = Integer.parseInt(arr[1]);
      timeArr = new int[N + 1];
      adjacentNodeListArr = new ArrayList[N + 1];
      edgeArr = new int[N + 1];
      minTimeArr = new Integer[N + 1];

      arr = br.readLine().split(" ");
      for (int i = 1; i <= N; ++i) {
        timeArr[i] = Integer.parseInt(arr[i - 1]);
        adjacentNodeListArr[i] = new ArrayList<>();
      }

      for (int i = 0; i < K; ++i) {
        arr = br.readLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);
        adjacentNodeListArr[start].add(end);
        edgeArr[end]++;
      }

      int target = Integer.parseInt(br.readLine());
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 1; i <= N; ++i) {
        if (edgeArr[i] == 0) {
          queue.offer(i);
          minTimeArr[i] = timeArr[i];
        }
      }

      while (!queue.isEmpty()) {
        int poll = queue.poll();
        for (int adjacentNode : adjacentNodeListArr[poll]) {
          edgeArr[adjacentNode]--;
          if (edgeArr[adjacentNode] == 0) {
            queue.offer(adjacentNode);
          }
          if (minTimeArr[adjacentNode] == null) {
            minTimeArr[adjacentNode] = minTimeArr[poll] + timeArr[adjacentNode];
          } else {
            minTimeArr[adjacentNode] = Math.max(minTimeArr[adjacentNode],
                minTimeArr[poll] + timeArr[adjacentNode]);
          }
        }
      }

      sb.append(minTimeArr[target]).append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}