import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

    static StringBuilder sb = new StringBuilder();

    static boolean[][] visited;

    static int[][] apart;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        apart = new int[N][N];

        for (int i = 0; i < N; ++i) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < N; ++j) {
                apart[i][j] = Integer.parseInt(arr[j]);
            }
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
             for (int j = 0; j < N; ++j) {
                int adjacentHouseCount = dfs(i, j);
                if (adjacentHouseCount != 0) {
                    count++;
                    list.add(adjacentHouseCount);
                }
            }
        }
        sb.append(count).append("\n");
        Collections.sort(list);
        for (int adjacentHouseCount : list) {
            sb.append(adjacentHouseCount).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int dfs(int x, int y) {
        if (visited[x][y]) {
            return 0;
        }
        if (apart[x][y] == 0) {
            return 0;
        }
        visited[x][y] = true;
        apart[x][y] = 0;
        int result = 1;
        if (x != 0) {
            result += dfs(x - 1, y);
        }
        if (y != 0) {
            result += dfs(x, y - 1);
        }
        if (x != N - 1) {
            result += dfs(x + 1, y);
        }
        if (y != N - 1) {
            result += dfs(x, y + 1);
        }
        return result;
    }
}