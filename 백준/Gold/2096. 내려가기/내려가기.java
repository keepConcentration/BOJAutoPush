import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] map;

    static Integer[][] minDp;
    static Integer[][] maxDp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        map = new int[N][3];
        minDp = new Integer[N][3];
        maxDp = new Integer[N][3];

        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < 3; ++j) {
                map[i][j] = parseInt(strArr[j]);
            }
        }

        minDp(N - 1, 0);
        minDp(N - 1, 1);
        minDp(N - 1, 2);

        maxDp(N - 1, 0);
        maxDp(N - 1, 1);
        maxDp(N - 1, 2);

        sb.append(Math.max(Math.max(maxDp[N - 1][0], maxDp[N - 1][1]), maxDp[N - 1][2]))
                .append(" ")
                .append(Math.min(Math.min(minDp[N - 1][0], minDp[N - 1][1]), minDp[N - 1][2]))
                .append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int minDp(int n, int m) {
        if (minDp[n][m] == null) {
            if (n == 0) {
                minDp[n][m] = map[n][m];
            } else {
                if (m == 0) {
                    minDp[n][m] = Math.min(minDp(n - 1, m), minDp(n - 1, m + 1));
                } else if (m == 1) {
                    minDp[n][m] = Math.min(Math.min(minDp(n - 1, m), minDp(n - 1, m + 1)), minDp(n - 1, m - 1));
                } else {
                    minDp[n][m] = Math.min(minDp(n - 1, m), minDp(n - 1, m - 1));
                }
                minDp[n][m] += map[n][m];
            }
        }
        return minDp[n][m];

    }

    private static int maxDp(int n, int m) {
        if (maxDp[n][m] == null) {
            if (n == 0) {
                maxDp[n][m] = map[n][m];
            } else {
                if (m == 0) {
                    maxDp[n][m] = Math.max(maxDp(n - 1, m), maxDp(n - 1, m + 1));
                } else if (m == 1) {
                    maxDp[n][m] = Math.max(Math.max(maxDp(n - 1, m), maxDp(n - 1, m + 1)), maxDp(n - 1, m - 1));
                } else {
                    maxDp[n][m] = Math.max(maxDp(n - 1, m), maxDp(n - 1, m - 1));
                }
                maxDp[n][m] += map[n][m];
            }
        }
        return maxDp[n][m];

    }

}
