import static java.lang.Integer.parseInt;

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

  static StringBuilder sb = new StringBuilder();

  static int N, M;

  static List<Integer>[] adjacencyList;

  static int[] edges;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strArr = br.readLine().split(" ");
    N = parseInt(strArr[0]);
    M = parseInt(strArr[1]);
    adjacencyList = new ArrayList[N + 1];
    edges = new int[N + 1];
    for (int i = 1; i <= N; ++i) {
      adjacencyList[i] = new ArrayList<>();
    }

    for (int i = 0; i < M; ++i) {
      strArr = br.readLine().split(" ");
      int count = parseInt(strArr[0]);
      if (count != 0) {
        int start = parseInt(strArr[1]);
        for (int j = 2; j < strArr.length; ++j) {
          int end = parseInt(strArr[j]);
          adjacencyList[start].add(end);
          edges[end]++;
          start = end;
        }
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= N; ++i) {
      if (edges[i] == 0) {
        queue.offer(i);
        sb.append(i).append("\n");
      }
    }

    while (!queue.isEmpty()) {
      int poll = queue.poll();
      for (int adjacencyNode : adjacencyList[poll]) {
        edges[adjacencyNode]--;
        if (edges[adjacencyNode] == 0) {
          queue.offer(adjacencyNode);
          sb.append(adjacencyNode).append("\n");
        }
      }
    }
    
    for (int edge : edges) {
      if (edge != 0) {
        sb = new StringBuilder();
        sb.append("0\n");
        break;
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
