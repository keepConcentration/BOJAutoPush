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

  static int N, M;
  static StringBuilder sb = new StringBuilder();
  static List<Integer>[] adjacentNodeListArr;
  static int[] edgeArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    String[] strArr = br.readLine().split(" ");

    N = Integer.parseInt(strArr[0]);
    M = Integer.parseInt(strArr[1]);

    adjacentNodeListArr = new ArrayList[N + 1];
    edgeArr = new int[N + 1];

    for (int i = 1; i <= N; ++i) {
      adjacentNodeListArr[i] = new ArrayList<>();
    }

    for (int i = 1; i <= M; ++i) {
      strArr = br.readLine().split(" ");
      int start = Integer.parseInt(strArr[0]);
      int end = Integer.parseInt(strArr[1]);

      adjacentNodeListArr[start].add(end);
      edgeArr[end]++;
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= N; ++i) {
      if (edgeArr[i] == 0) {
        queue.offer(i);
      }
    }
    
    while (!queue.isEmpty()) {
      int poll = queue.poll();
      sb.append(poll).append(" ");
      for (int adjacentNode : adjacentNodeListArr[poll]) {
        edgeArr[adjacentNode]--;
        if (edgeArr[adjacentNode] == 0) {
          queue.offer(adjacentNode);
        }
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}