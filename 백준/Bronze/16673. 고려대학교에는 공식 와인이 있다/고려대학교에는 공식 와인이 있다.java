import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] strArr = br.readLine().split(" ");
        int C = parseInt(strArr[0]);
        int K = parseInt(strArr[1]);
        int P = parseInt(strArr[2]);

        int result = 0;
        for (int i = 1; i <= C; ++i) {
            result += K * i + P * i * i;
        }
        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
