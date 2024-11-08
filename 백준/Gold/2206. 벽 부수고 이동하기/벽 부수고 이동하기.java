import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static Integer[][][] dp;

    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int N = parseInt(strArr[0]);
        int M = parseInt(strArr[1]);
        if (N == 1 && M == 1) {
            System.out.println(1);
            return;
        }
        map = new int[N][M];
        dp = new Integer[N][M][2];
        for (int i = 0; i < N; ++i) {
            strArr = br.readLine().split("");
            for (int j = 0; j < M; ++j) {
                map[i][j] = parseInt(strArr[j]);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        // y, x, count, 벽 부수기 가능수
        queue.offer(new int[]{0, 0, 1, 1});
        dp[0][0][1] = 1;
        dp[N - 1][M - 1][0] = dp[N - 1][M - 1][1] = -1;

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};

        l:
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curY = poll[0];
            int curX = poll[1];
            int curCount = poll[2];
            int canDestroy = poll[3];

            for (int i = 0; i < 4; ++i) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];
                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M) {
                    continue;
                }
                if (nextY == N - 1 && nextX == M - 1) {
                    dp[nextY][nextX][0] = curCount + 1;
                    dp[nextY][nextX][1] = curCount + 1;
                    break l;
                }
                if (dp[nextY][nextX][canDestroy] != null) {
                    continue;
                }
                if (map[nextY][nextX] == 0) {
                    if (dp[nextY][nextX][0] != null && dp[nextY][nextX][1] != null) {
                        continue;
                    }
                    dp[nextY][nextX][canDestroy] = curCount + 1;
                    queue.offer(new int[]{nextY, nextX, curCount + 1, canDestroy});
                    continue;
                }
                if (map[nextY][nextX] == 1 && canDestroy == 1) {
                    dp[nextY][nextX][canDestroy] = curCount + 1;
                    queue.offer(new int[]{nextY, nextX, curCount + 1, 0});
                }
            }
        }
        sb.append(dp[N - 1][M - 1][0]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
