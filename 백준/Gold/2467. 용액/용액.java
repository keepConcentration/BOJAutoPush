import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    N = Integer.parseInt(br.readLine());
    int[] liquids = new int[N];
    String[] arr = br.readLine().split(" ");

    for (int i = 0; i < N; ++i) {
      liquids[i] = Integer.parseInt(arr[i]);
    }

    // min 저장
    long min = Long.MAX_VALUE;
    // 변수
    int leftIdx = 0;
    int rightIdx = N - 1;
    int minLeftIdx = 0;
    int minRightIdx = N - 1;
    while (leftIdx < rightIdx) {
      long sum = liquids[leftIdx] + liquids[rightIdx];
      if (min > Math.abs(sum)) {
        minLeftIdx = leftIdx;
        minRightIdx = rightIdx;
        min = Math.abs(sum);
      }
      if (sum < 0) {
        leftIdx++;
      } else {
        rightIdx--;
      }
    }

    sb.append(liquids[minLeftIdx]).append(" ").append(liquids[minRightIdx]);

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}