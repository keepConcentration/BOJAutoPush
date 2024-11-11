import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        M = 6;
        result = new int[M];
        String str;
        String[] strArr;
        while (!(str = br.readLine()).equals("0")) {
            strArr = str.split(" ");
            N = parseInt(strArr[0]);
            arr = new int[N];
            visited = new boolean[N];
            for (int i = 1; i <= N; ++i) {
                arr[i - 1] = parseInt(strArr[i]);
            }

            backtracking(0, 0);

            sb.append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backtracking(int start, int depth) {
        if (depth == M) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                backtracking(i, depth + 1);
                visited[i] = false;
            }
        }
    }
}