import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  static StringBuilder sb = new StringBuilder();
  static int[] result;
  static int[] arr;
  static int N, M;
  static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] strArr = br.readLine().split(" ");
    N = parseInt(strArr[0]);
    M = parseInt(strArr[1]);
    arr = new int[N];
    visited = new boolean[N];
    result = new int[M];

    strArr = br.readLine().split(" ");
    for (int i = 0; i < N; ++i) {
      arr[i] = parseInt(strArr[i]);
    }
    Arrays.sort(arr);

    backtracking(0, 0);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();

  }

  private static void backtracking(int start, int depth) {
    if (depth == M) {
      for (int i = 0; i < M; ++i) {
        sb.append(result[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = start; i < arr.length; ++i) {
      if (!visited[i]) {
        visited[i] = true;
        result[depth] = arr[i];
        backtracking(i, depth + 1);
        visited[i] = false;
      }
    }
  }
}
