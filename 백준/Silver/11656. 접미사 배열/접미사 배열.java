import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();

    String[] arr = new String[str.length()];

    for (int i = 0; i < str.length(); ++i) {
      String part = str.substring(i);
      arr[i] = part;
    }
    Arrays.sort(arr);

    for (String s : arr) {
      sb.append(s).append("\n");
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}