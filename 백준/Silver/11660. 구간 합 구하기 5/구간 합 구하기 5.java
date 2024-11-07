import java.io.*;

class Main {

    static int[][] dp = new int[1025][1025];

    static int N;

    static int[][] data = new int[1025][1025];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");

        N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        for (int i = 1; i <= N; ++i) {
            arr = br.readLine().split(" ");
            for (int j = 1; j <= N; ++j) {
                data[i][j] = Integer.parseInt(arr[j - 1]);
            }
        }

        recursion(N, N);

        for (int i = 0; i < M; ++i) {
            arr = br.readLine().split(" ");
            int x1 = Integer.parseInt(arr[0]);
            int y1 = Integer.parseInt(arr[1]);
            int x2 = Integer.parseInt(arr[2]);
            int y2 = Integer.parseInt(arr[3]);
            sb.append(sum(x1, y1, x2, y2)).append("\n");
        }


        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int recursion(int x, int y) {
        if (dp[x][y] == 0) {
            if (x == 1 && y == 1) {
                dp[x][y] = data[1][1];
                return dp[x][y];
            }
            if (x != 1 && y != 1) {
                dp[x][y] = recursion(x - 1, y) + recursion(x, y - 1) - recursion(x - 1, y - 1) + data[x][y];
            } else if (x == 1) {
                dp[x][y] = recursion(x, y - 1) + data[x][y];
            } else {
                dp[x][y] = recursion(x - 1, y) + data[x][y];
            }
        }
        return dp[x][y];
    }

    private static int sum(int x1, int y1, int x2, int y2) {
        return dp[x2][y2] - dp[x2][y1-1] -dp[x1-1][y2] + dp[x1-1][y1-1];
    }
}