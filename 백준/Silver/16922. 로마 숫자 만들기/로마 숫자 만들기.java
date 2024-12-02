import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean[] visited;
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        N = parseInt(br.readLine());
        visited = new boolean[1001];

        backTracking(0, 0, 0);

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void backTracking(int index, int n, int depth) {
        if (depth == N) {
            if (!visited[n]) {
                result++;
                visited[n] = true;
            }
            return;
        }

        for (int i = index; i < 4; ++i) {
            int num = getNum(i);
            backTracking(i, num + n, depth + 1);
        }
    }

    static int getNum(int j) {
        if (j == 0) {
            return 1;
        } else if (j == 1) {
            return 5;
        } else if (j == 2) {
            return 10;
        }
        return 50;
    }
}
