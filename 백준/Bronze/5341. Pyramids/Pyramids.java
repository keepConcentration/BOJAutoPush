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

    int in = 0;
    while ((in = parseInt(br.readLine())) != 0) {
      int result = 0;
      for (int i = in; i > 0; --i) {
        result += i;
      }
      sb.append(result).append("\n");
    }
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}