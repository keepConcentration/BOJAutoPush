import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());

    while (T-- > 0) {
      String[] arr = br.readLine().split(" ");
      int N = Integer.parseInt(arr[0]);

      long result = 0;

      for (int i = 1; i < arr.length - 1; ++i) {
        for (int j = i + 1; j < arr.length; ++j) {
          int a = Integer.parseInt(arr[i]);
          int b = Integer.parseInt(arr[j]);
          int temp;
          if (a < b) {
            temp = a;
            a = b;
            b = temp;
          }

          while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
          }
          result += a;
        }
      }
      sb.append(result).append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}