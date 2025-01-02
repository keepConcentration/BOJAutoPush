import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        double d = Double.parseDouble(br.readLine());

        sb.append((int) d).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
