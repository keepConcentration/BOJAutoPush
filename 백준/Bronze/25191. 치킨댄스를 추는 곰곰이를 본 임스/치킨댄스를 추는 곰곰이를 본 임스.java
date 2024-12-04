import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int chicken = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int cola = parseInt(strArr[0]);
        int beer = parseInt(strArr[1]);

        sb.append(Math.min(chicken, cola / 2 + beer)).append("\n");


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
