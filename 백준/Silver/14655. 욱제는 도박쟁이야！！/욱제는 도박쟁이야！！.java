import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());

        int max = 0;
        int min = 0;
        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            max += Math.abs(parseInt(strArr[i]));
        }
        strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            min -= Math.abs(parseInt(strArr[i]));
        }

        sb.append(max - min);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
