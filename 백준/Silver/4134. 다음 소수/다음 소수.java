import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (long i = 0; i < N; ++i) {
            long in = Long.parseLong(br.readLine());
            if (in == 0L || in == 1 || in == 2) {
                sb.append(2).append("\n");
                continue;
            }
            long prime = 0;
            l:for (long j = in; j <= Long.MAX_VALUE; ++j) {
                for (long k = 2; k <= (long)(Math.sqrt(j)); ++k) {
                    if (j % k == 0) {
                        continue l;
                    }
                }
                prime = j;
                break l;
            }
            sb.append(prime).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
