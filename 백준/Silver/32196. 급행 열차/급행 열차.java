import java.io.*;
import java.util.Arrays;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static long K;
    static long X;
    static long Y;
    static long result = 0;

    public static void main(String[] args) throws IOException {
        N = read();
        M = read();
        K = read();
        X = read();
        Y = read();

        long[] arr = new long[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = (long) read() * X - (long) read() * Y;
        }
        Arrays.sort(arr);

        result = X * K + Y * K;
        for (int i = 0; i < M; ++i) {
            result += arr[i];
        }

        sb.append(result).append("\n");
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
