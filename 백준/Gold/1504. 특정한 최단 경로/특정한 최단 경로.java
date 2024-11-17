import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

  static StringBuilder sb = new StringBuilder();

  static int N, E;

  static List<int[]>[] adjacencyList;

  static int[] toFirstNodeResult;
  static int[] firstToLastResult;
  static int[] secondToLastResult;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strArr = br.readLine().split(" ");
    N = parseInt(strArr[0]);
    E = parseInt(strArr[1]);

    adjacencyList = new ArrayList[N + 1];
    toFirstNodeResult = new int[N + 1];
    Arrays.fill(toFirstNodeResult, Integer.MAX_VALUE);
    for (int i = 1; i <= N; ++i) {
      adjacencyList[i] = new ArrayList<>();
    }

    for (int i = 0; i < E; ++i) {
      strArr = br.readLine().split(" ");
      int startNode = parseInt(strArr[0]);
      int endNode = parseInt(strArr[1]);
      int weight = parseInt(strArr[2]);

      adjacencyList[startNode].add(new int[]{endNode, weight});
      adjacencyList[endNode].add(new int[]{startNode, weight});
    }

    strArr = br.readLine().split(" ");
    int target1 = parseInt(strArr[0]);
    int target2 = parseInt(strArr[1]);
    
    toFirstNodeResult = dijkstra(1);
    firstToLastResult = dijkstra(target1);
    secondToLastResult = dijkstra(target2);
    
    if (E == 0 || firstToLastResult[N] == Integer.MAX_VALUE
        && secondToLastResult[N] == Integer.MAX_VALUE) {
      sb.append("-1\n");
    } else {
      sb.append(
              Math.min(toFirstNodeResult[target1] + firstToLastResult[target2] + secondToLastResult[N],
                  toFirstNodeResult[target2] + secondToLastResult[target1] + firstToLastResult[N]))
          .append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static int[] dijkstra(int start) {
    int[] arr = new int[N + 1];
    Arrays.fill(arr, Integer.MAX_VALUE);
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{start, 0});
    arr[start] = 0;
    while (!queue.isEmpty()) {
      int[] poll = queue.poll();
      int node = poll[0];
      int weight = poll[1];

      for (int[] adjacencyNode : adjacencyList[node]) {
        int nextNode = adjacencyNode[0];
        int nextWeight = adjacencyNode[1] + weight;

        if (arr[nextNode] > nextWeight) {
          queue.offer(new int[]{nextNode, nextWeight});
          arr[nextNode] = nextWeight;
        }
      }
    }
    return arr;
  }
}