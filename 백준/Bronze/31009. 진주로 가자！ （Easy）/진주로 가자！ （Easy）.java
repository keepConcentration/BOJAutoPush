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
    int N = Integer.parseInt(br.readLine());
    int[] intArr = new int[N];

    int jinju = 0;
    for (int i = 0; i < N; ++i) {
      String[] arr = br.readLine().split(" ");
      intArr[i] = Integer.parseInt(arr[1]);
      if (arr[0].equals("jinju")) {
        jinju = intArr[i];
      }
    }

    sb.append(jinju).append("\n");

    int count = 0;
    for (int i = 0; i < N; ++i) {
      if (intArr[i] > jinju) {
        count++;
      }
    }
    sb.append(count);
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}