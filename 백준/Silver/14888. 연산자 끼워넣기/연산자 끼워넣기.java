import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] A;
    static int[] operator = new int[4];
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = parseInt(br.readLine());
        A = new int[N];

        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            A[i] = parseInt(strArr[i]);
        }

        strArr = br.readLine().split(" ");
        for (int i = 0; i < 4; ++i) {
            operator[i] = parseInt(strArr[i]);
        }

        backtracking(0, A[0]);

        sb.append(maxValue).append("\n").append(minValue).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void backtracking(int depth, int value) {
        if (depth == N - 1) {
            maxValue = Math.max(maxValue, value);
            minValue = Math.min(minValue, value);
            return;
        }

        for (int i = 0; i < 4; ++i) {
            if (operator[i] > 0) {
                operator[i]--;
                switch (i) {
                    case 0: backtracking(depth + 1, value + A[depth + 1]); break;
                    case 1: backtracking(depth + 1, value - A[depth + 1]); break;
                    case 2: backtracking(depth + 1, value * A[depth + 1]); break;
                    case 3: backtracking(depth + 1, value / A[depth + 1]);
                }
                operator[i]++;
            }
        }
    }

}
