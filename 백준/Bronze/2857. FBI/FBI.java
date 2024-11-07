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
    for (int i = 1; i <= 5; ++i) {
      String in = br.readLine();
      if (in.contains("FBI")) {
        sb.append(i).append(" ");
      }
    }
    if (sb.length() == 0) {
      sb.append("HE GOT AWAY!");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}