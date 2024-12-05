import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] map;

    static int mapX;
    static int mapY;
    static int result = 0;

    static int dp[][];
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");

        mapY = parseInt(strArr[0]);
        mapX = parseInt(strArr[1]);

        map = new int[mapY][mapX];
        dp = new int[mapY][mapX];
        for (int i = 0; i < mapY; ++i) {
            strArr = br.readLine().split(" ");
            for (int j = 0; j < mapX; ++j) {
                map[i][j] = parseInt(strArr[j]);
                dp[i][j] = -1;
            }
        }

        sb.append(dfs(0, 0)).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean canVisit(int y, int x) {
        return y >= 0 && y < mapY && x >= 0 && x < mapX;
    }

    static int dfs(int y, int x) {
        if (y == mapY - 1 && x == mapX - 1) {
            return 1;
        }
        if (dp[y][x] != -1) {
            return dp[y][x];
        }

        dp[y][x] = 0;
        int height = map[y][x];
        for (int i = 0; i < 4; ++i) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (canVisit(nextY, nextX)) {
                int nextHeight = map[nextY][nextX];
                if (nextHeight < height) {
                    dp[y][x] += dfs(nextY, nextX);
                }
            }
        }
        return dp[y][x];
    }
}
