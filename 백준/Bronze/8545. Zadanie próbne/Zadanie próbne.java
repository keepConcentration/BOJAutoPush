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
    sb.append(br.readLine()).reverse().append("\n");
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}