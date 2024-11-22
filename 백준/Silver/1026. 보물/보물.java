import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int N = parseInt(br.readLine());
    String[] strArr = br.readLine().split(" ");
    int[] arr = new int[N];
    for (int i = 0; i < N; ++i) {
      arr[i] = parseInt(strArr[i]);
    }

    Arrays.sort(arr);

    strArr = br.readLine().split(" ");
    int[] arr2 = new int[N];
    for (int i = 0; i < N; ++i) {
      arr2[i] = parseInt(strArr[i]);
    }
    Arrays.sort(arr2);

    int result = 0;
    for (int i = 0; i < N; ++i) {
      result += arr[N - 1 - i] * arr2[i];
    }

    sb.append(result).append("\n");

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}