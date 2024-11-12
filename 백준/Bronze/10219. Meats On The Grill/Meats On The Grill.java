import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        while (N-- > 0) {
            String[] strArr = br.readLine().split(" ");

            int H = parseInt(strArr[0]);
            for (int i = 0; i < H; ++i) {
                StringBuilder in = new StringBuilder(br.readLine());
                sb.append(in.reverse()).append("\n");
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
