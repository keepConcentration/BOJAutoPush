import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String in = br.readLine();
        if ("SONGDO".equals(in)) {
            sb.append("HIGHSCHOOL\n");
        } else if ("CODE".equals(in)) {
            sb.append("MASTER\n");
        } else if ("2023".equals(in)) {
            sb.append("0611\n");
        } else {
            sb.append("CONTEST\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
