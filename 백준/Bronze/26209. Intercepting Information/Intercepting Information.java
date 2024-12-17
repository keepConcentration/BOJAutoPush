import java.io.*;
import java.util.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        for (int i = 0; i < 8; ++i) {
            int in = read();
            if (in != 0 && in != 1) {
                flag = false;
            }
        }
        
        sb.append(flag ? "S\n" : "F\n");
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
