import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);
        arr = new int[N];
        visited = new boolean[N];
        strArr = br.readLine().split(" ");

        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(strArr[i]);
        }

        Arrays.sort(arr);

        backtracking(0, "");


        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backtracking(int depth, String str) {
        if (depth == M) {
            sb.append(str + "\n");
            return;
        }
        for (int i = 0; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(depth + 1, str + arr[i] + " ");
                visited[i] = false;
            }
        }
    }
}