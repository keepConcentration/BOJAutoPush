import java.io.*;

class Main {

    static Integer[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        dp = new Integer[51][51][51];
        String in;
        while (!(in = br.readLine()).equals("-1 -1 -1")) {
            String[] arr = in.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
                    .append(w(a, b, c)).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (dp[a][b][c] != null) {
            return dp[a][b][c];
        }
        if (a > 20 || b > 20 || c > 20) {
            dp[a][b][c] = w(20, 20, 20);
            return dp[a][b][c];
        }
        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return dp[a][b][c];
        }
        dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        return dp[a][b][c];
    }
}