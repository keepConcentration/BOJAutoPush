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
    StringBuilder N = new StringBuilder(br.readLine());

    while (N.length() % 3 != 0) {
      N.insert(0, "0");
    }
    for (int i = 0; i < N.length(); i += 3) {
      String n = N.substring(i, i + 3);
      int resultN = 0;
      char cha = n.charAt(0);
      if (cha == '1') {
        resultN += 4;
      }
      cha = n.charAt(1);
      if (cha == '1') {
        resultN += 2;
      }
      cha = n.charAt(2);
      if (cha == '1') {
        resultN += 1;
      }
      sb.append(resultN);
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}