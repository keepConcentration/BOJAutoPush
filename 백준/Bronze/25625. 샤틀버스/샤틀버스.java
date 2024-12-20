import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int X, Y;

    public static void main(String[] args) throws IOException {
        X = read();
        Y = read();

        if (X == Y) {
            sb.append(X);
        } else if (X < Y) {
            sb.append(Y - X);
        } else {
            sb.append(X + Y);
        }

        sb.append("\n");
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
