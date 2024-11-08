import java.io.*;
import java.math.BigInteger;

class Main {
    static Integer[] dp = new Integer[16];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int B = Integer.parseInt(br.readLine());

        sb.append(B / 11 * 10);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}