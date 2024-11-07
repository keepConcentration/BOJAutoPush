import java.io.*;

class Main {

    static Integer[] dp = new Integer[1_000_001];

    static int remain = 15746;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        sb.append(recursion(N));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = (recursion(n - 1) % remain + recursion(n - 2) % remain) % remain;
        }
        return dp[n];
    }
}
