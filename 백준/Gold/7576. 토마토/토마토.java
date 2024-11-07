import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int[][] tomatoBox;
    static int[][] visitedDays;
    static int unfinishedTomatoCount;

    static int N;

    static int M;
    
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        M = Integer.parseInt(arr[0]);
        N = Integer.parseInt(arr[1]);
        tomatoBox = new int[N][M];
        visitedDays = new int[N][M];

        for (int i = 0; i < N; ++i) {
            arr = br.readLine().split(" ");
            for (int j = 0; j < M; ++j) {
                int tomatoParam = Integer.parseInt(arr[j]);
                if (tomatoParam == 0) {
                    unfinishedTomatoCount++;
                } else if (tomatoParam == 1){
                    queue.add(new int[]{i, j});
                }
                tomatoBox[i][j] = Integer.parseInt(arr[j]);
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

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int currentX = poll[0];
            int currentY = poll[1];
            visitedDay = visitedDays[currentX][currentY];

            if (currentX != 0 && tomatoBox[currentX - 1][currentY] == 0) {
                tomatoBox[currentX - 1][currentY] = 1;
                unfinishedTomatoCount--;
                visitedDays[currentX - 1][currentY] = visitedDay + 1;
                queue.offer(new int[] {currentX - 1, currentY});
            }
            if (currentY != 0 && tomatoBox[currentX][currentY - 1] == 0) {
                tomatoBox[currentX][currentY - 1] = 1;
                unfinishedTomatoCount--;
                visitedDays[currentX][currentY - 1] = visitedDay + 1;
                queue.offer(new int[] {currentX, currentY - 1});
            }
            if (currentX != N - 1 && tomatoBox[currentX + 1][currentY] == 0) {
                tomatoBox[currentX + 1][currentY] = 1;
                unfinishedTomatoCount--;
                visitedDays[currentX + 1][currentY] = visitedDay + 1;
                queue.offer(new int[] {currentX + 1, currentY});
            }
            if (currentY != M - 1 && tomatoBox[currentX][currentY + 1] == 0) {
                tomatoBox[currentX][currentY + 1] = 1;
                unfinishedTomatoCount--;
                visitedDays[currentX][currentY + 1] = visitedDay + 1;
                queue.offer(new int[] {currentX, currentY + 1});
            }
        }
        return visitedDay;
    }
}