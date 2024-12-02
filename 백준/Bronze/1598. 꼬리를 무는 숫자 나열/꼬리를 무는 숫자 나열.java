import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");

        int a = parseInt(strArr[0]) - 1;
        int b = parseInt(strArr[1]) - 1;
        sb.append(Math.abs(a / 4 - b / 4) + Math.abs((a % 4 - b % 4))).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
