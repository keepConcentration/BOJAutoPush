import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder(br.readLine());

    int N = Integer.parseInt(br.readLine());

    int cursor = sb.length();

    while (N-- > 0) {
      String[] arr = br.readLine().split(" ");
      String order = arr[0];
      if ("L".equals(order)) {
        if (cursor > 0) {
          cursor--;
        }
      } else if ("D".equals(order)) {
        if (cursor < sb.length()) {
          cursor++;
        }
      } else if ("B".equals(order)) {
        if (cursor > 0) {
          cursor--;
          sb.deleteCharAt(cursor);
        }
      } else if ("P".equals(order)) {
        sb.insert(cursor, arr[1]);
        cursor++;
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

}