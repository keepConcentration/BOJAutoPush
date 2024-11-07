import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static Integer[][] dp;

  static int[][] data;

  static int N;

  static int K;

  static final int W = 0;
  static final int V = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    String[] arr = br.readLine().split(" ");
    N = Integer.parseInt(arr[0]);
    K = Integer.parseInt(arr[1]);
    data = new int[N][2];
    dp = new Integer[N][K + 1];
    for (int i = 0; i < N; ++i) {
      arr = br.readLine().split(" ");
      data[i][W] = Integer.parseInt(arr[0]);
      data[i][V] = Integer.parseInt(arr[1]);
    }

    sb.append(recursion(N - 1, K));

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static int recursion(int n, int remainWeight) {
    if (n < 0) {
      return 0;
    }
    if (dp[n][remainWeight] == null) {
      int weight = data[n][W];
      int value = data[n][V];
      if (weight > remainWeight) {
        dp[n][remainWeight] = recursion(n - 1, remainWeight);
      } else {
        dp[n][remainWeight] = Math.max(recursion(n - 1, remainWeight),
            recursion(n - 1, remainWeight - weight) + value);
      }
    }
    return dp[n][remainWeight];
  }
}
