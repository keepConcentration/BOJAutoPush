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
    int[] intArr = new int[5];
    String[] arr = br.readLine().split(" ");
    for (int i = 0; i < N; ++i) {
      intArr[i] = Integer.parseInt(arr[i]);
    }
    int result;
    if (intArr[0] > intArr[2]) {
      result = (intArr[0] - intArr[2]) * 508;
    } else {
      result = (intArr[2] - intArr[0]) * 108;
    }
    if (intArr[1] > intArr[3]) {
      result += (intArr[1] - intArr[3]) * 212;
    } else {
      result += (intArr[3] - intArr[1]) * 305;
    }
    result += intArr[4] * 707;

    result *= 4763;
    sb.append(result);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}