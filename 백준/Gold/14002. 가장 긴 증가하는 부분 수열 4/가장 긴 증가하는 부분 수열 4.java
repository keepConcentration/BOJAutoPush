import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] data;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        N = read();
        dp = new Integer[N + 1];
        data = new int[N + 1];
        data[0] = Integer.MAX_VALUE;

        for (int i = 1; i <= N; ++i) {
            data[i] = read();
        }
        for (int i = 1; i <= N; ++i) {
            recursion(i);
        }

        int max = dp[1];
        int maxIndex = 1;
        for (int i = 2; i <= N; ++i) {
            if (dp[i] > max) {
                max = dp[i];
                maxIndex = i;
            }
        }
        sb.append(max).append("\n");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = maxIndex; i > 0; --i) {
            if (dp[i] == max) {
                max--;
                stack.push(data[i]);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int n) {
        if (dp[n] == null) {
            dp[n] = 1;
            for (int i = n - 1; i > 0; --i) {
                if (data[n] > data[i]) {
                    dp[n] = Math.max(dp[n], recursion(i) + 1);
                }
            }
        }
        return dp[n];
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }
}
