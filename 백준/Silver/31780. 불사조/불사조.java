import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int X;
    static int M;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");
        X = parseInt(strArr[0]);
        M = parseInt(strArr[1]);
        
        long result = recursion(X, 0);

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static long recursion(int x, int depth) {
        if (depth == M) {
            return x;
        }
        if (x % 2 == 0) {
            return x + recursion(x / 2, depth + 1) * 2;
        } else {
            return x + recursion(x / 2, depth + 1) + recursion(x / 2 + 1, depth + 1);
        }
    }
}
