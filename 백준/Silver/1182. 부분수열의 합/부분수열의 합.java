import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int S;

    static int result = 0;

    static int[] arr;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");

        N = parseInt(strArr[0]);
        S = parseInt(strArr[1]);

        arr = new int[N];
        visited = new boolean[N];

        strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(strArr[i]);
        }

        backtracking(0, 0, 0);

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backtracking(int start, int depth, int num) {
        if (num == S && depth > 0) {
            result++;
        }
        if (depth == N) {
            return;
        }
        for (int i = start; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i, depth + 1, num + arr[i]);
                visited[i] = false;
            }
        }
    }
}