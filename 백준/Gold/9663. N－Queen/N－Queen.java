import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] map;

    static long result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        map = new int[N];

        queen(0);

        sb.append(result);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



    private static void queen(int depth) {
        if (depth == N) {
            result++;
            return;
        }

        l: // 열 loop
        for (int i = 0; i < N; ++i) {
            map[depth] = i;
            // 이미 놓인 queen 찾기
            if (isSatisfiedCondition(depth)) {
                queen(depth + 1);
            }
        }
    }

    private static boolean isSatisfiedCondition(int n) {
        // 열
        for (int i = 0; i < n; ++i) {
            if (map[i] == map[n]) {
                return false;
            }

            if (Math.abs(n - i) == Math.abs(map[i] - map[n])) {
                return false;
            }

        }

        return true;
    }
}