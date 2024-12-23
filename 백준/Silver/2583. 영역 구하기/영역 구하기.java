import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int X, Y, K;
    static boolean[][] map;
    static boolean[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        Y = read();
        X = read();
        K = read();

        map = new boolean[Y][X];
        visited = new boolean[Y][X];

        while (K-- > 0) {
            int startX = read();
            int startY = read();
            int endX = read();
            int endY = read();
            for (; startX < endX; ++startX) {
                for (int i = startY; i < endY; ++i) {
                    map[i][startX] = true;
                }
            }
        }
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        int result = 0;
        for (int x = 0; x < X; ++x) {
            for (int y = 0; y < Y; ++y) {
                if (!visited[y][x] && !map[y][x]) {
                    arrayDeque.push(dfs(y, x));
                    result++;
                }
            }
        }

        sb.append(result).append("\n");

        int[] arr = new int[arrayDeque.size()];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arrayDeque.pop();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]).append(" ");
        }

        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int dfs(int y, int x) {
        if (visited[y][x] || map[y][x]) {
            return 0;
        }
        visited[y][x] = true;
        int result = 1;
        for (int i = 0; i < 4; ++i) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (canVisit(nextY, nextX)) {
                if (!visited[nextY][nextX]) {
                    if (!map[y][x]) {
                        result += dfs(nextY, nextX);
                    }
                }
            }
        }
        return result;
    }

    private static boolean canVisit(int y, int x) {
        return y >= 0 && y < Y && x >= 0 && x < X;
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}
