import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String[] arr = br.readLine().split(" ");
    final int BEFORE = Integer.parseInt(arr[0]);
    final int AFTER = Integer.parseInt(arr[1]);

    int M = Integer.parseInt(br.readLine());
    String[] beforeNumber = br.readLine().split(" ");

    int result10 = 0;
    int m = M - 1;
    for (int i = 0; i < M; ++i) {
      result10 += (int) Math.pow(BEFORE, m) * Integer.parseInt(beforeNumber[i]);
      m--;
    }

    List<Integer> list = new ArrayList<>();

    while (result10 != 0) {
      list.add(result10 % AFTER);
      result10 /= AFTER;
    }

    for (int i = list.size() - 1; i >= 0; --i) {
      sb.append(list.get(i)).append(" ");
    }
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}