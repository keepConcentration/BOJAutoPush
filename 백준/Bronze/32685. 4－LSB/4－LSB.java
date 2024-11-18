import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String binary1 = toBinaryString(parseInt(br.readLine()));
    while (binary1.length() < 4) {
      binary1 = "0" + binary1;
    }
    String binary2 = toBinaryString(parseInt(br.readLine()));
    while (binary2.length() < 4) {
      binary2 = "0" + binary2;
    }
    String binary3 = toBinaryString(parseInt(br.readLine()));
    while (binary3.length() < 4) {
      binary3 = "0" + binary3;
    }

    String result1 = binary1.substring(binary1.length() - 4);
    result1 += binary2.substring(binary2.length() - 4);
    result1 += binary3.substring(binary3.length() - 4);

    int result = Integer.parseInt(result1, 2);
    String res = String.valueOf(result);
    while (res.length() < 4) {
      res = "0" + res;
    }

    sb.append(res);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
