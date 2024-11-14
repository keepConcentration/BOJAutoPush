import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static boolean[][] map;

    static long result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        map = new boolean[N][N];

        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < N; ++j) {
                map[i][j] = strArr[j].equals("0") ? true : false;
            }
        }

        if (!map[N - 1][N - 1]) {
            System.out.println(0);
            return;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0, 0, 1});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int backY = poll[0];
            int backX = poll[1];
            int y = poll[2];
            int x = poll[3];

            int nextX = x + 1;
            int nextY = y + 1;
            if (isValidLocation(nextY, nextX)) {
                if (map[y + 1][x] && map[y][x + 1]) {
                    if (nextY == N - 1 && nextX == N - 1) {
                        result++;
                    } else {
                        queue.offer(new int[] {y, x, nextY, nextX});
                    }
                }
            }
            if (y != backY) {
                nextY = y + 1;
                nextX = x;
                if (isValidLocation(nextY, nextX)) {
                    if (nextY == N - 1 && nextX == N - 1) {
                        result++;
                    } else {
                        queue.offer(new int[] {y, x, nextY, nextX});
                    }
                }
            }
            if (x != backX) {
                nextY = y;
                nextX = x + 1;
                if (isValidLocation(nextY, nextX)) {
                    if (nextY == N - 1 && nextX == N - 1) {
                        result++;
                    } else {
                        queue.offer(new int[] {y, x, nextY, nextX});
                    }
                }
            }
        }

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isValidLocation(int y, int x) {
        return y < N && x < N && map[y][x];
    }

}