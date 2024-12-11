import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int L;
    static int n;

    public static void main(String[] args) throws IOException {
        L = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        n = parseInt(br.readLine());
        int min = 0;
        int max = Integer.MAX_VALUE;
        boolean possible = true;
        for (int i = 0; i < L; ++i) {
            int num = parseInt(strArr[i]);
            if (num < n) {
                min = Math.max(num, min);
            } else if (num > n) {
                max = Math.min(num, max);
            } else {
                sb.append("0\n");
                possible = false;
                break;
            }
        }
        if (possible) {
            sb.append((n - min) * (max - n) - 1).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
