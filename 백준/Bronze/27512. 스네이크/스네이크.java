import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");

        int n = parseInt(strArr[0]);
        int m = parseInt(strArr[1]);

        if ((n * m) % 2 == 0) {
            sb.append(n * m);
        } else {
            sb.append(n * m - 1);
        }
        sb.append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
