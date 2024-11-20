import java.io.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        boolean click = false;
        int result = 0;
        for (int i = 0; i < N; ++i) {
            result += parseDouble(strArr[i]);
            if (strArr[i].indexOf(".5") != -1 && !click) {
                result++;
                click = true;
                continue;
            }
            if (!strArr[i].equals("0")) {
                click = true;
            }
        }

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
