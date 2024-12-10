import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {

    for (int i = 0; i < 2; ++i) {
      String[] strArr = br.readLine().split(" ");

      int result =
          parseInt(strArr[0]) * 6 + parseInt(strArr[1]) * 3 + parseInt(strArr[2]) * 2 + parseInt(
              strArr[3]) + parseInt(strArr[4]) * 2;
      sb.append(result).append(" ");
    }
    sb.append("\n");
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}