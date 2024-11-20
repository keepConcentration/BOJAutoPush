import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String in = br.readLine();

        in = in.replaceAll("XXXX", "AAAA");
        in = in.replaceAll("XX", "BB");

        if (in.indexOf("X") != -1) {
            sb.append("-1\n");
        } else {
            sb.append(in).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
