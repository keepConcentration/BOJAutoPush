import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    static Integer[] dp = new Integer[11];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 11; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < N; ++i) {
            int in = Integer.parseInt(br.readLine());
            sb.append(dp[in]).append("\n");;
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}