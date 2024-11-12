import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            sum += parseInt(arr[i]);
        }
        sb.append(Math.max(parseInt(arr[4]) * 4 - sum, 0)).append("\n");


        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
