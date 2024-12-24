import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = read();
        int M = read();

        boolean valid = true;
        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            int aCount = 0;
            for (int j = 0; j < M; ++j) {
                if ("A".equals(strArr[j])) {
                    aCount++;
                }
            }
            if (aCount == 0 || aCount > 1) {
                valid = false;
                break;
            }
        }

        if (valid) {
            sb.append("Yes\n");
        } else {
            sb.append("No\n");
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
