import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static long[] dp;

  static int remain = 1_000_000_007;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    dp = new long[100001];
    dp[2] = 1;
    dp[4] = 3;
    sb.append(recursion(N));
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static long recursion(int n) {
    if (dp[n] == 0) {
      dp[n] = (((n - 1) % remain) * (recursion(n - 2) % remain)) % remain;
    }
    return dp[n];
  }
}