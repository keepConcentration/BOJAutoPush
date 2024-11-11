import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static char[][] map1;
    static char[][] map2;
    static boolean[][] visited;
    static int N;

    static int result1 = 0, result2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());

        map1 = new char[N][N];
        map2 = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; ++i) {
            char[] arr = br.readLine().toCharArray();
            map1[i] = arr;
            for (int j = 0; j < N; ++j) {
                char in = arr[j];
                if (in == 'R') {
                    in = 'G';
                }
                map2[i][j] = in;
            }
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (!visited[i][j]) {
                    bfs1(i, j);
                    result1++;
                }
            }
        }

        visited = new boolean[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (!visited[i][j]) {
                    bfs2(i, j);
                    result2++;
                }
            }
        }

        sb.append(result1).append(" ").append(result2);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void bfs1(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;

        char color = map1[y][x];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curY = poll[0];
            int curX = poll[1];

            for (int i = 0; i < 4; ++i) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];
                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= N) {
                    continue;
                }
                if (visited[nextY][nextX]) {
                    continue;
                }
                if (map1[nextY][nextX] != color) {
                    continue;
                }
                visited[nextY][nextX] = true;
                queue.offer(new int[] {nextY, nextX});
            }
        }
    }

    private static void bfs2(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;

        char color = map2[y][x];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curY = poll[0];
            int curX = poll[1];

            for (int i = 0; i < 4; ++i) {
                int nextY = curY + dy[i];
                int nextX = curX + dx[i];
                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= N) {
                    continue;
                }
                if (visited[nextY][nextX]) {
                    continue;
                }
                if (map2[nextY][nextX] != color) {
                    continue;
                }
                visited[nextY][nextX] = true;
                queue.offer(new int[] {nextY, nextX});
            }
        }
    }
}