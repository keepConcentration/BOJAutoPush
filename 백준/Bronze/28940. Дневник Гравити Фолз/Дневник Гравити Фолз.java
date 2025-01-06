import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int w = read();
        int h = read();
        int n = read();
        int a = read();
        int b = read();

        if (a > w || b > h) {
            sb.append("-1\n");
        } else {
            int ww = w / a;
            int hh = h / b;

            int result = 0;
            int totalWord = 0;

            while (totalWord < n) {
                totalWord += ww * hh;
                result++;
            }
            sb.append(result).append("\n");
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
