import java.io.*;

class Main {

    static boolean[][] boolArr;

    static int M;

    static int N;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            M = Integer.parseInt(arr[0]);
            N = Integer.parseInt(arr[1]);
            int P = Integer.parseInt(arr[2]);

            boolArr = new boolean[M][N];

            for (int i = 0; i < P; ++i) {
                arr = br.readLine().split(" ");
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                boolArr[x][y] = true;
            }

            int result = 0;
            for (int i = 0; i < M; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (boolArr[i][j]) {
                        dfs(i, j);
                        result++;
                    }
                }
            }

            sb.append(result).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        if (!boolArr[x][y]) {
            return;
        }
        boolArr[x][y] = false;
        if (x != M - 1) {
            dfs(x + 1, y);
        }
        if (y != N - 1) {
            dfs(x, y + 1);
        }
        if (x != 0) {
            dfs(x - 1, y);
        }
        if (y != 0) {
            dfs(x, y - 1);
        }
    }
}