import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = read();
        int M = read();
        int K = read();
        if ((N == 1 || N == 3) && (M == 6 || M == 8) && (K == 2 || K == 5)) {
            sb.append("JAH\n");
        } else {
            sb.append("EI\n");
        }
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
