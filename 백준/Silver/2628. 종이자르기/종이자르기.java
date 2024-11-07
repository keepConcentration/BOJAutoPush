import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String[] arr = br.readLine().split(" ");
    int X = Integer.parseInt(arr[0]);
    int Y = Integer.parseInt(arr[1]);

    List<Integer> xList = new ArrayList<>();
    List<Integer> yList = new ArrayList<>();
    xList.add(0);
    xList.add(X);
    yList.add(0);
    yList.add(Y);

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; ++i) {
      arr = br.readLine().split(" ");
      if ("0".equals(arr[0])) {
        yList.add(Integer.parseInt(arr[1]));
      } else {
        xList.add(Integer.parseInt(arr[1]));
      }
    }

    xList.sort(Comparator.comparingInt(Integer::intValue));
    yList.sort(Comparator.comparingInt(Integer::intValue));

    int max = 0;
    for (int i = 1; i < xList.size(); ++i) {
      int x = xList.get(i) - xList.get(i - 1);
      for (int j = 1; j < yList.size(); ++j) {
        max = Math.max(max, x * (yList.get(j) - yList.get(j - 1)));
      }
    }
    sb.append(max);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}