import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = read() - 1;
        int a = read();
        int b = read();
        boolean valid = true;
        while (N-- > 0) {
            int aa = read();
            int bb = read();
            if (a > aa || b > bb) {
                valid = false;
            }
            a = aa;
            b = bb;
        }
        if (valid) {
            sb.append("yes\n");
        } else {
            sb.append("no\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }
}
