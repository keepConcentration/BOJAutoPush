import java.io.*;
import java.math.BigInteger;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;

    static int map[][];
    static Integer[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);

        map = new int[N][M];
        visited = new Integer[N][M];
        for (int i = 0; i < N; ++i) {
            arr = br.readLine().split(" ");
            for (int j = 0; j < M; ++j) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        visited[0][0] = map[0][0];
        sb.append(recursion(N - 1, M - 1));
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int x, int y) {
        if (visited[x][y] != null) {
            return visited[x][y];
        }
        int max = 0;
        if (x > 0) {
            if (y > 0) {
                max = Math.max(max, recursion(x - 1, y - 1) + map[x][y]);
            }
            max = Math.max(max, recursion(x - 1, y) + map[x][y]);
        }
        if (y > 0) {
            max = Math.max(max, recursion(x, y - 1) + map[x][y]);
        }
        visited[x][y] = max;
        return max;
    }
}