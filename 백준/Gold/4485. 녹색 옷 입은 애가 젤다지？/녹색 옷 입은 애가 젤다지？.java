import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    static int[][] map;
    static Integer[][] dp;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        int t = 0;
        while ((N = read()) != 0) {
            t++;
            map = new int[N][N];
            dp = new Integer[N][N];

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    map[i][j] = read();
                }
            }
            dp[0][0] = map[0][0];

            PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
            queue.offer(new Node(0, 0, map[0][0]));

            while (!queue.isEmpty()) {
                Node poll = queue.poll();
                int y = poll.y;
                int x = poll.x;

                for (int i = 0; i < 4; ++i) {
                    int nextY = y + dy[i];
                    int nextX = x + dx[i];
                    if (canVisit(nextY, nextX)) {
                        if (dp[nextY][nextX] == null || dp[nextY][nextX] > dp[y][x] + map[nextY][nextX]) {
                            dp[nextY][nextX] = dp[y][x] + map[nextY][nextX];
                            queue.offer(new Node(nextY, nextX, dp[nextY][nextX]));
                        }
                    }
                }
            }

            sb.append("Problem ").append(t).append(": ").append(dp[N - 1][N - 1]).append("\n");
        }


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

    private static class Node {
        int y;
        int x;
        int weight;

        Node(int y, int x, int weight) {
            this.y = y;
            this.x = x;
            this.weight = weight;
        }
    }

    private static boolean canVisit(int y, int x) {
        return y >= 0 && y < N && x >= 0 && x < N;
    }
}
