import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int d = 0, p = 0;
        for (int i = 0; i < N; ++i) {
            String winner = br.readLine();
            if ("D".equals(winner)) {
                d++;
            } else {
                p++;
            }
            if (d == p + 2 || d + 2 == p) {
                break;
            }
        }
        sb.append(d).append(":").append(p);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
