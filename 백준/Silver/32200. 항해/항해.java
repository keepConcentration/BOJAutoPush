import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int X;
    static int Y;

    public static void main(String[] args) throws IOException {
        N = read();
        X = read();
        Y = read();

        int result = 0;
        int remain = 0;

        for (int i = 0; i < N; ++i) {
            int sandwich = read();
            int tempResult = sandwich / X;
            int tempRemain = sandwich % X;
            result += tempResult;

            if (tempResult == 0) {
                remain += tempRemain;
                continue;
            }
            int maxRemain = tempResult * (Y - X);
            if (tempRemain > maxRemain) {
                remain += tempRemain - maxRemain;
            }
        }

        sb.append(result).append("\n").append(remain).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }
}
