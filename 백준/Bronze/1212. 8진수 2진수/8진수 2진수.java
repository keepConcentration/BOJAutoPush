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
    String N = br.readLine();

    for (int i = 0; i < N.length(); i++) {
      int cha = Integer.parseInt(N.substring(i, i + 1));
      String n = "";
      if (cha >= 4) {
        n += "1";
        cha -= 4;
      } else {
        n += "0";
      }

      if (cha >= 2) {
        n += "1";
        cha -= 2;
      } else {
        n += "0";
      }

      n += cha >= 1 ? "1" : "0";

      sb.append(n);
    }
    while (sb.length() > 1 && sb.charAt(0) == '0') {
      sb.deleteCharAt(0);
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}