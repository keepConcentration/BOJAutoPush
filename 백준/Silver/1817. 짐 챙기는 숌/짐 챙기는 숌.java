import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);

        int boxCount = 0;
        if (N != 0) {
            strArr = br.readLine().split(" ");
            int prevWeight = 0;
            boxCount++;
            for (int i = 0; i < N; ++i) {
                int book = parseInt(strArr[i]);
                if (prevWeight + book <= M) {
                    prevWeight += book;
                } else {
                    boxCount++;
                    prevWeight = book;
                }
            }
        }

        sb.append(boxCount).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
