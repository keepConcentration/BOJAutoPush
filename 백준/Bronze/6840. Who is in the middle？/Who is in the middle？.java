import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {

    int[] arr = new int[3];
    arr[0] = parseInt(br.readLine());
    arr[1] = parseInt(br.readLine());
    arr[2] = parseInt(br.readLine());
    
    Arrays.sort(arr);
    
    sb.append(arr[1]).append("\n");
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}