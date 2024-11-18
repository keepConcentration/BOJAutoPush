import static java.lang.Double.parseDouble;

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

    String[] strArr = br.readLine().split(" ");
    double result1 = 0;
    double result2 = 1.5;
    result1 += parseDouble(strArr[0]) * 13;
    result1 += parseDouble(strArr[1]) * 7;
    result1 += parseDouble(strArr[2]) * 5;
    result1 += parseDouble(strArr[3]) * 3;
    result1 += parseDouble(strArr[4]) * 3;
    result1 += parseDouble(strArr[5]) * 2;

    strArr = br.readLine().split(" ");
    result2 += parseDouble(strArr[0]) * 13;
    result2 += parseDouble(strArr[1]) * 7;
    result2 += parseDouble(strArr[2]) * 5;
    result2 += parseDouble(strArr[3]) * 3;
    result2 += parseDouble(strArr[4]) * 3;
    result2 += parseDouble(strArr[5]) * 2;

    sb.append(result1 > result2 ? "cocjr0208\n" : "ekwoo\n");

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
