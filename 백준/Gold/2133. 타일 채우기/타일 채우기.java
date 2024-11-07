import java.io.*;

class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[31];
        dp[0] = 1;
        dp[2] = 3;
        dp[4] = 11;
        if (N % 2 == 0) {
            sb.append(recursion(N));
        } else {
            sb.append(0);
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = recursion(n - 2) * 4 - recursion(n - 4);
        }
        return dp[n];
    }
}