import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

  static class Node {

    int index;
    int weight;

    Node(int index, int weight) {
      this.index = index;
      this.weight = weight;
    }
  }

  static StringBuilder sb = new StringBuilder();

  static int N;

  static List<Node>[] adjacencyList;

  static final int INF = 2_000_000;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = parseInt(br.readLine());
    adjacencyList = new ArrayList[N + 1];
    for (int i = 1; i <= N; ++i) {
      adjacencyList[i] = new ArrayList<>();
    }

    for (int i = 0; i < N - 1; ++i) {
      String[] strArr = br.readLine().split(" ");
      int parentNode = parseInt(strArr[0]);
      int childNode = parseInt(strArr[1]);
      int weight = parseInt(strArr[2]);
      adjacencyList[parentNode].add(new Node(childNode, weight));
      adjacencyList[childNode].add(new Node(parentNode, weight));
    }

    int[] arr = dijkstra(1);

    int max = 0;
    int maxIndex = 1;
    for (int i = 1; i <= N; ++i) {
      if (max < arr[i] && arr[i] != INF) {
        max = Math.max(arr[i], max);
        maxIndex = i;
      }
    }

    max = 0;
    int[] arr2 = dijkstra(maxIndex);
    for (int i = 1; i <= N; ++i) {
      if (max < arr2[i] && arr2[i] != INF) {
        max = Math.max(arr2[i], max);
      }
    }

    sb.append(max);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static int[] dijkstra(int start) {
    Queue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
    queue.offer(new Node(start, 0));
    boolean[] visited = new boolean[N + 1];
    int[] result = new int[N + 1];
    Arrays.fill(result, INF);
    visited[start] = true;
    while (!queue.isEmpty()) {
      Node poll = queue.poll();
      for (Node adjacencyNode : adjacencyList[poll.index]) {
        if (!visited[adjacencyNode.index]) {
          if (result[adjacencyNode.index] > poll.weight + adjacencyNode.weight) {
            result[adjacencyNode.index] = poll.weight + adjacencyNode.weight;
            queue.offer(new Node(adjacencyNode.index, result[adjacencyNode.index]));
          }
        }
      }
    }
    return result;
  }
}