import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int R, C;
    static char[][] map;
    static int[] dp = new int[91];
    static int result = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        R = read();
        C = read();

        map = new char[R][C];

        for (int i = 0; i < R; ++i) {
            map[i] = br.readLine().toCharArray();
        }

        dp[map[0][0]] = 1;
        backtracking(0, 0, 1);
        sb.append(result);

        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }

    private static void backtracking(int y, int x, int count) {
        result = Math.max(result, count);

        for (int i = 0; i < 4; ++i) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (canVisit(nextY, nextX)) {
                if (dp[map[nextY][nextX]] == 0) {
                    dp[map[nextY][nextX]]++;
                    backtracking(nextY, nextX, count + 1);
                    dp[map[nextY][nextX]]--;
                }
            }
        }
    }

    private static boolean canVisit(int y, int x) {
        return y >= 0 && y < R && x >= 0 && x < C;
    }

}
