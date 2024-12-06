import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] map;

    static int N;
    static int M;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] counts;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");

        M = parseInt(strArr[0]);
        N = parseInt(strArr[1]);

        map = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        counts = new int[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            strArr = br.readLine().split("");
            for (int j = 1; j <= M; ++j) {
                map[i][j] = parseInt(strArr[j - 1]);
                counts[i][j] = Integer.MAX_VALUE;
            }
        }
        counts[1][1] = 0;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {1, 1, 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int y = poll[0];
            int x = poll[1];
            int count = poll[2];

            for (int i = 0; i < 4; ++i) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];
                int nextCount = count;
                if (!canVisit(nextY, nextX)) {
                    continue;
                }

                int wall = map[nextY][nextX];
                if (wall == 1) {
                    nextCount++;
                }
                if (counts[nextY][nextX] > nextCount) {
                    counts[nextY][nextX] = nextCount;
                    queue.offer(new int[] {nextY, nextX, nextCount});
                }

            }
        }

        sb.append(counts[N][M]).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean canVisit(int y, int x) {
        return y > 0 && y <= N && x > 0 && x <= M;
    }
}
