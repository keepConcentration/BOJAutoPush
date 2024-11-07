import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int n, m;
    static int[][] map;

    static Integer[][] result;

    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");

        n = parseInt(strArr[0]);
        m = parseInt(strArr[1]);
        map = new int[n][m];

        result = new Integer[n][m];
        visited = new boolean[n][m];

        int destinationX = 0, destinationY = 0;

        for (int i = 0; i < n; ++i) {
            strArr = br.readLine().split(" ");
            for (int j = 0; j < m; ++j) {
                map[i][j] = Integer.parseInt(strArr[j]);
                if (map[i][j] == 2) {
                    destinationX = j;
                    destinationY = i;
                    result[i][j] = 0;
                }
                if (map[i][j] == 0) {
                    result[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        bfs(destinationY, destinationX);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (result[i][j] == null) {
                    result[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                sb.append(result[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {y, x, 0});

        int[] filterI = new int[] {-1, 1, 0, 0};
        int[] filterJ = new int[] {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] location = queue.poll();
            int val = location[2];
            if (visited[location[0]][location[1]]) {
                continue;
            }
            visited[location[0]][location[1]] = true;
            result[location[0]][location[1]] = val;
            int nextVal = val + 1;

            for (int i = 0; i < 4; ++i) {
                int nextI = location[0] + filterI[i];
                int nextJ = location[1] + filterJ[i];
                if (nextI < 0 || nextI >= n || nextJ < 0 || nextJ >= m) {
                    continue;
                }
                if (!visited[nextI][nextJ]) {
                    queue.offer(new int[] {nextI, nextJ, nextVal});
                }
            }
        }
    }
}