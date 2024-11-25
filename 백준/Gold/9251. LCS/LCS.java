import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static char[] arr1;
    static char[] arr2;
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        dp = new Integer[arr1.length][arr2.length];

        recursion(arr1.length - 1, arr2.length - 1);

        sb.append(dp[arr1.length - 1][arr2.length - 1]).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int recursion(int n, int m) {
        if (n == -1 || m == -1) {
            return 0;
        }
        if (dp[n][m] == null) {
            dp[n][m] = 0;
            if (arr1[n] == arr2[m]) {
                dp[n][m] = recursion(n - 1, m - 1) + 1;
            } else {
                dp[n][m] = Math.max(recursion(n - 1, m), recursion(n, m - 1));
            }
        }
        return dp[n][m];
    }
}
