import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            int in = parseInt(arr[i]);
            result[i] = in * (i + 1) - sum;
            sum += result[i];
            sb.append(result[i]).append(" ");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
