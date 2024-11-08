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

    br.readLine();
    StringBuilder str = new StringBuilder(br.readLine());

    int count = 0;
    if (str.length() > 3) {
      char first = str.charAt(0);
      char second = str.charAt(1);
      char third = str.charAt(2);
      for (int i = 3; i < str.length(); ++i) {
        char fourth = str.charAt(i);
        if (first == 'p' && second == 'P' && third == 'A' && fourth == 'p') {
          count++;
          str.replace(i - 3, i + 1, "    ");
        }
        first = str.charAt(i - 2);
        second = str.charAt(i - 1);
        third = str.charAt(i);
      }
    }
    sb.append(count);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}