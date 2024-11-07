import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int[][][] tomatoBox;
    static int[][][] visitedDays;
    static int unfinishedTomatoCount;

    static int N, M, H;

    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        H = Integer.parseInt(arr[2]);
        M = Integer.parseInt(arr[0]);
        N = Integer.parseInt(arr[1]);
        tomatoBox = new int[H][N][M];
        visitedDays = new int[H][N][M];

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < N; ++j) {
                arr = br.readLine().split(" ");
                for (int k = 0; k < M; ++k) {
                    int tomatoParam = Integer.parseInt(arr[k]);
                    if (tomatoParam == 0) {
                        unfinishedTomatoCount++;
                    } else if (tomatoParam == 1) {
                        queue.offer(new int[]{i, j, k});
                    }
                    tomatoBox[i][j][k] = Integer.parseInt(arr[k]);
                }
            }
        }

        int result = bfs();
        if (unfinishedTomatoCount != 0) {
            result = -1;
        }

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int bfs() {
        int visitedDay = 0;

        int[] dx = {-1, 1, 0, 0, 0, 0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dz = {0, 0, 0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int currentX = poll[1];
            int currentY = poll[2];
            int currentZ = poll[0];
            visitedDay = visitedDays[currentZ][currentX][currentY];

            for (int i = 0; i < 6; ++i) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                int nextZ = currentZ + dz[i];
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && nextZ >= 0 && nextZ < H) {
                    if (tomatoBox[nextZ][nextX][nextY] == 0) {
                        tomatoBox[nextZ][nextX][nextY] = 1;
                        unfinishedTomatoCount--;
                        visitedDays[nextZ][nextX][nextY] = visitedDay + 1;
                        queue.offer(new int[]{nextZ, nextX, nextY});
                    }
                }
            }
        }
        return visitedDay;
    }
}