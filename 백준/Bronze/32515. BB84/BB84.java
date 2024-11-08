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
    char[] arr1 = br.readLine().toCharArray();
    char[] arr2 = br.readLine().toCharArray();
    char[] arr3 = br.readLine().toCharArray();
    char[] arr4 = br.readLine().toCharArray();

    for (int i = 0; i < N; ++i) {
      if (arr1[i] == arr3[i]) {
        if (arr2[i] != arr4[i]) {
          sb = new StringBuilder("htg!\n");
          break;
        }
        sb.append(arr2[i]);
      }
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}