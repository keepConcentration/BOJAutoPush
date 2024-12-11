import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    public static void main(String[] args) throws IOException {
        N = read();
        int[] arr = new int[1_000_001];
        for (int i = 0; i < N; ++i) {
            arr[read()]++;
        }
        for (int i = 0; i < N; ++i) {
            arr[read()]--;
        }

        int result = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }

        sb.append(result).append("\n");

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
