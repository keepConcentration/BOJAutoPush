import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String[] arr = br.readLine().split(" ");

    int N = Integer.parseInt(arr[0]);
    int K = Integer.parseInt(arr[1]);

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= N; ++i) {
      queue.add(i);
    }

    sb.append("<");
    int k = 0;
    while (!queue.isEmpty()) {
      int poll = queue.poll();
      k++;
      if (k % K == 0) {
        sb.append(poll);
        if (!queue.isEmpty()) {
          sb.append(", ");
        } else {
          sb.append(">");
        }
      } else {
        queue.add(poll);
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}