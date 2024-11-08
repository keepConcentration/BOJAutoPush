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

    int N = Integer.parseInt(br.readLine());

    String[] strArr = br.readLine().split("");
    int halfLength = strArr.length / 2;

    int result = 0;

    for (int i = 0; i < halfLength; ++i) {
      String a = strArr[i];
      String b = strArr[N - 1 - i];
      if (a.equals("?")) {
        if (b.equals("?")) {
          result += 26;
        } else {
          result++;
        }
      } else {
        if (b.equals("?")) {
          result += 1;
        } else {
          if (!a.equals(b)) {
            result = 0;
            break;
          }
        }
      }
    }

    sb.append(result);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}