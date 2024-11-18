import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static int[][] map;

    static List<int[]> chickenMap;

    static int chickenCount;

    static int minResult = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);

        map = new int[N][N];
        chickenMap = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            strArr = br.readLine().split(" ");
            for (int j = 0; j < N; ++j) {
                map[i][j] = parseInt(strArr[j]);
                if (map[i][j] == 2) {
                    chickenCount++;
                    chickenMap.add(new int[] {i, j});
                }
            }
        }
        backtracking(0, 0, chickenCount - M);

        sb.append(minResult).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backtracking(int y, int x, int deleteChickenCount) {
        if (x == N) {
            backtracking(y + 1, 0, deleteChickenCount);
            return;
        }

        if (y == N && deleteChickenCount != 0) {
            return;
        }

        if (deleteChickenCount == 0) {
            minResult = Math.min(getResult(), minResult);
            return;
        }

        for (int i = y; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (i == y && j == 0 && x != 0) {
                    j = x;
                }
                if (map[i][j] == 2) {
                    map[i][j] = 0;
                    int[] get = new int[2];
                    for (int k = 0; k < chickenMap.size(); ++k) {
                        get = chickenMap.get(k);
                        if (get[0] == i && get[1] == j) {
                            chickenMap.remove(k);
                            break;
                        }
                    }
                    backtracking(i, j + 1, deleteChickenCount - 1);
                    map[i][j] = 2;
                    chickenMap.add(get);
                }
            }
        }
    }

    private static int getResult() {
        int result = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (map[i][j] == 1) {
                    int minDist = Integer.MAX_VALUE;
                    for (int k = 0; k < chickenMap.size(); ++k) {
                        int[] get = chickenMap.get(k);
                        minDist = Math.min(minDist, Math.abs(i - get[0]) + Math.abs(j - get[1]));
                    }
                    result += minDist;
                    if (result > minResult) {
                        return minResult;
                    }
                }
            }
        }
        return result;
    }
}
