import java.io.*;
import java.util.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int N = read();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 0;
        for (int i = 0; i < N; ++i) {
            char charAt = str.charAt(i);
            if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
                count++;
            }
        }

        sb.append(count).append("\n");
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