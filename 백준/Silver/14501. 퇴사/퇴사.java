import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static int[][] data;

  static int N;

  static final int T = 0;
  static final int P = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    N = Integer.parseInt(br.readLine());
    data = new int[N][2];
    for (int i = 0; i < N; ++i) {
      String[] arr = br.readLine().split(" ");
      data[i][T] = Integer.parseInt(arr[0]);
      data[i][P] = Integer.parseInt(arr[1]);
    }

    sb.append(recursion(0, 0));

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();

  }

  private static int recursion(int n, int prevPrice) {
    if (n >= N) {
      return prevPrice;
    }
    int time = data[n][T];
    int price = data[n][P];
    if (n + time <= N) {
      return Math.max(recursion(n + time, prevPrice + price), recursion(n + 1, prevPrice));
    }
    return recursion(n + 1, prevPrice);
  }
}
