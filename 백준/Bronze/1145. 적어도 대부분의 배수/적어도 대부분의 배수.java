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

    String[] strArr = br.readLine().split(" ");
    int[] arr = new int[5];
    for (int i = 0; i < 5; ++i) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    int result = Integer.MAX_VALUE;
    for (int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) {
        for (int k = j + 1; k < 5; ++k) {
          result = Math.min(lcm(lcm(arr[i], arr[j]), arr[k]), result);
        }
      }
    }

    sb.append(result);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  private static int gcd(int a, int b) {
    int tempA = a;
    int tempB = b;
    int tempC;
    while (tempB != 0) {
      tempC = tempA % tempB;
      tempA = tempB;
      tempB = tempC;
    }
    return tempA;
  }

  private static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}