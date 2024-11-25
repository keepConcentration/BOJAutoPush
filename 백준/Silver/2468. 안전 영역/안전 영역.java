import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        N = parseInt(br.readLine());

        arr = new int[N][N];
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        int maxResult = 1;

        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < N; ++j) {
                arr[i][j] = parseInt(strArr[j]);
                minHeight = Math.min(minHeight, arr[i][j]);
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        for (int water = minHeight; water <= maxHeight; ++water) {
            boolean[][] visited = new boolean[N][N];
            int result = 0;
            Queue<int[]> queue = new LinkedList<>();

            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (arr[i][j] > water && !visited[i][j]) {
                        queue.offer( new int[] {i, j});
                        while (!queue.isEmpty()) {
                            int[] poll = queue.poll();
                            int y = poll[0];
                            int x = poll[1];
                            visited[y][x] = true;
                            for (int z = 0; z < 4; ++z) {
                                int nextY = y + dy[z];
                                int nextX = x + dx[z];
                                if (canVisit(nextY, nextX) && !visited[nextY][nextX] && water < arr[nextY][nextX]) {
                                    if (!visited[nextY][nextX] && water < arr[nextY][nextX]) {
                                        queue.offer(new int[]{nextY, nextX});
                                    }
                                    visited[nextY][nextX] = true;
                                }
                            }
                        }
                        result++;
                    }
                }
            }
            maxResult = Math.max(maxResult, result);

        }

        sb.append(maxResult).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean canVisit(int y, int x) {
        return y >= 0 && y < N && x >= 0 && x < N;
    }
}
