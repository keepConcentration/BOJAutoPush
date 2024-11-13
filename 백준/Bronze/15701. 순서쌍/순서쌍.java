import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= Math.sqrt(N); ++i) {
            if (N % i == 0) {
                if (N / i == i) {
                    result++;
                } else {
                    result += 2;
                }
            }
        }

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
