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

    String[] strArr = br.readLine().split(" ");
    int N = Integer.parseInt(strArr[0]);
    int S = Integer.parseInt(strArr[1]);
    int[] arr = new int[N];
    strArr = br.readLine().split(" ");

    for (int i = 0; i < N; ++i) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    long minCount = Long.MAX_VALUE;
    int left = 0;
    int right = 0;
    long sum = arr[left];
    while (left < arr.length) {
      long count = right - left + 1;
      if (count >= minCount) {
        sum -= arr[left];
        left++;
        continue;
      }
      if (sum >= S) {
        if (count < minCount) {
          minCount = count;
          sum -= arr[left];
          left++;
          if (left > arr.length - 1) {
            break;
          }
        }
      } else {
        right++;
        if (right > arr.length - 1) {
          break;
        }
        sum += arr[right];
      }
    }

    if (minCount == Long.MAX_VALUE) {
      minCount = 0;
    }
    sb.append(minCount);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}