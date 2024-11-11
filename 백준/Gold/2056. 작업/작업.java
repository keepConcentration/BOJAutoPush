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

  static List<Integer>[] adjacencyList;
  static int N;

  static boolean[] visited;
  static int[] times;
  static int[] edges;
  static Integer[] minTimes;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = parseInt(br.readLine());
    visited = new boolean[N + 1];
    edges = new int[N + 1];
    times = new int[N + 1];
    adjacencyList = new ArrayList[N + 1];
    minTimes = new Integer[N + 1];

    for (int i = 1; i <= N; ++i) {
      adjacencyList[i] = new ArrayList<>();
    }

    for (int i = 1; i <= N; ++i) {
      String[] strArr = br.readLine().split(" ");
      int time = parseInt(strArr[0]);
      times[i] = time;
      int m = parseInt(strArr[1]);
      for (int j = 2; j < strArr.length; ++j) {
        adjacencyList[parseInt(strArr[j])].add(i);
        edges[i]++;
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i < edges.length; ++i) {
      if (edges[i] == 0) {
        minTimes[i] = times[i];
        queue.offer(i);
      }
    }
    
    while (!queue.isEmpty()) {
      int poll = queue.poll();
      
      for (int adjacencyNode : adjacencyList[poll]) {
        edges[adjacencyNode]--;
        if (edges[adjacencyNode] == 0) {
          queue.offer(adjacencyNode);
        }

        if (minTimes[adjacencyNode] == null) {
          minTimes[adjacencyNode] = minTimes[poll] + times[adjacencyNode];
        } else {
          minTimes[adjacencyNode] = Math.max(minTimes[poll] + times[adjacencyNode],
              minTimes[adjacencyNode]);
        }
      }
    }
    int max = Integer.MIN_VALUE;
    
    for (int i = 1; i < minTimes.length; ++i) {
      max = Math.max(minTimes[i], max);
    }
    sb.append(max);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
