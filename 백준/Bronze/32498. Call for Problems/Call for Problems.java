import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        int N = parseInt(br.readLine());

        int result = 0;
        while (N-- > 0) {
            int in = parseInt(br.readLine());
            if (in % 2 == 1) {
                result++;
            }
        }
        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
