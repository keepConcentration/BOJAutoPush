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
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N - 1; ++i) {
      sb1.append(1);
      sb2.append(0);
    }
    sb1.append(1);

    sb.append(sb1).append(sb2);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}