import java.io.*;

public class Main {

  static int remain = 1000000;
  static Long[] dp;
  static String str;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    dp = new Long[5001];

    str = br.readLine();
    dp[0] = dp[1] = 1L;
    long result;
    try {
      if (str.charAt(0) == '0') {
        throw new Exception();
      }
      result = recursion(str.length());
    } catch (Exception e) {
      result = 0;
    }
    sb.append(result);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();

  }

  private static long recursion(int n) throws Exception {
    if (dp[n] == null) {
      int currentNumber = Character.getNumericValue(str.charAt(n - 1));
      int prevNumber = Character.getNumericValue(str.charAt(n - 2));

      if (prevNumber == 0 && currentNumber == 0) {
        throw new Exception();
      }
      if (prevNumber == 0) {
        dp[n] = recursion(n - 1) % remain;
      } else if (currentNumber == 0) {
        if (prevNumber * 10 + currentNumber > 20) {
          throw new Exception();
        }
        dp[n] = recursion(n - 2) % remain;
      } else if (prevNumber * 10 + currentNumber < 27) {
        dp[n] = (recursion(n - 1) % remain + recursion(n - 2) % remain) % remain;
      } else {
        dp[n] = recursion(n - 1) % remain;
      }
    }
    return dp[n];
  }

}
