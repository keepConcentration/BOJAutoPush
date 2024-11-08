import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static Long[][] dp;

  static long remain = 1_000_000_009;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    dp = new Long[100001][4];
    dp[1][1] = 1L;
    dp[1][2] = 0L;
    dp[1][3] = 0L;
    dp[2][1] = 0L;
    dp[2][2] = 1L;
    dp[2][3] = 0L;
    dp[3][1] = 1L;
    dp[3][2] = 1L;
    dp[3][3] = 1L;

    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      int N = Integer.parseInt(br.readLine());
      sb.append((recursion(N, 1) + recursion(N, 2) + recursion(N, 3)) % remain).append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static long recursion(int n, int lastNumber) {
    if (dp[n][lastNumber] == null) {
      if (lastNumber == 1) {
        dp[n][lastNumber] =
            (recursion(n - 1, 2) + recursion(n - 1, 3)) % remain;
      } else if (lastNumber == 2) {
        dp[n][lastNumber] =
            (recursion(n - 2, 1) + recursion(n - 2, 3)) % remain;
      } else {
        dp[n][lastNumber] =
            (recursion(n - 3, 1) + recursion(n - 3, 2)) % remain;
      }
    }
    return dp[n][lastNumber];
  }
}