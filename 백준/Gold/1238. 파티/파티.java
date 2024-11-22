import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

  static class Node {

    int index;
    int weight;

    Node(int index, int weight) {
      this.index = index;
      this.weight = weight;
    }
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static StringBuilder sb = new StringBuilder();

  static List<Node>[] adjacencyList;

  static Integer[][] result;

  static int[] edges;
  static int N;

  public static void main(String[] args) throws IOException {

    String[] strArr = br.readLine().split(" ");
    N = parseInt(strArr[0]);
    int M = parseInt(strArr[1]);
    int X = parseInt(strArr[2]);

    adjacencyList = new ArrayList[N + 1];
    edges = new int[N + 1];
    result = new Integer[N + 1][N + 1];
    for (int i = 1; i <= N; ++i) {
      adjacencyList[i] = new ArrayList<>();
    }

    for (int i = 0; i < M; ++i) {
      strArr = br.readLine().split(" ");
      int startNode = parseInt(strArr[0]);
      int endNode = parseInt(strArr[1]);
      int weight = parseInt(strArr[2]);
      adjacencyList[startNode].add(new Node(endNode, weight));
      edges[endNode]++;
    }

    for (int i = 1; i <= N; ++i) {
      result[i] = dijkstra(i);
    }

    int res = 0;
    for (int i = 1; i <= N; ++i) {
      if (i != X) {
        res = Math.max(result[i][X] + result[X][i], res);
      }
    }

    sb.append(res).append("\n");

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  static Integer[] dijkstra(int start) {
    PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    Integer[] result = new Integer[N + 1];
    boolean[] visited = new boolean[N + 1];
    int[] copyEdges = Arrays.copyOf(edges, edges.length);
    queue.offer(new Node(start, 0));
    while (!queue.isEmpty()) {
      Node poll = queue.poll();
      int index = poll.index;
      int weight = poll.weight;
      visited[index] = true;

      for (Node adjacencyNode : adjacencyList[index]) {
        int nextIndex = adjacencyNode.index;
        int nextWeight = adjacencyNode.weight + weight;
        copyEdges[nextIndex]--;

        if (!visited[nextIndex]) {
          if (result[nextIndex] != null) {
            if (result[nextIndex] < nextWeight) {
              continue;
            }
            result[nextIndex] = Math.min(result[nextIndex], nextWeight);
          } else {
            result[nextIndex] = nextWeight;
          }
          queue.offer(new Node(nextIndex, nextWeight));
        }
      }
    }
    return result;
  }
}