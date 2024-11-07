import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  static HashSet<Integer>[] adjacentNodeHashSetArr;

  static final int RED = 1;
  static final int BLUE = 2;

  static int[] visitArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int K = Integer.parseInt(br.readLine());
    k:
    while (K-- > 0) {
      String[] arr = br.readLine().split(" ");
      int V = Integer.parseInt(arr[0]);
      int E = Integer.parseInt(arr[1]);

      adjacentNodeHashSetArr = new HashSet[V + 1];
      visitArr = new int[V + 1];
      for (int i = 1; i < adjacentNodeHashSetArr.length; ++i) {
        adjacentNodeHashSetArr[i] = new HashSet<>();
      }

      for (int i = 0; i < E; ++i) {
        arr = br.readLine().split(" ");
        int u = Integer.parseInt(arr[0]);
        int v = Integer.parseInt(arr[1]);
        adjacentNodeHashSetArr[u].add(v);
        adjacentNodeHashSetArr[v].add(u);
      }
      for (int i = 1; i <= V; ++i) {
        if (visitArr[i] == 0) {
          if (!bfs(i)) {
            sb.append("NO\n");
            continue k;
          }
        }
      }
      sb.append("YES\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static boolean bfs(int n) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(n);
    if (visitArr[n] == 0) {
      visitArr[n] = RED;
    }
    while (!queue.isEmpty()) {
      Integer poll = queue.poll();
      HashSet<Integer> adjacentList = adjacentNodeHashSetArr[poll];
      Iterator<Integer> iter = adjacentList.iterator();
      while (iter.hasNext()) {
        int adjacentNode = iter.next();
        if (visitArr[adjacentNode] == visitArr[poll]) {
          return false;
        }
        if (visitArr[adjacentNode] != 0) {
          continue;
        }
        visitArr[adjacentNode] = visitArr[poll] == RED ? BLUE : RED;
        if (!queue.contains(adjacentNode)) {
          queue.add(adjacentNode);
        }
      }

    }
    return true;
  }
}