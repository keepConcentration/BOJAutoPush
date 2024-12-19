import java.io.*;
import java.util.Arrays;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int L, C;
    static char[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        L = read();
        C = read();
        map = new char[C];
        visited = new boolean[C];

        String[] strArr = br.readLine().split(" ");
        Arrays.sort(strArr);

        for (int i = 0; i < C; ++i) {
            map[i] = strArr[i].charAt(0);
        }

        backtracking(new char[L], 0, 0);

        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void backtracking(char[] arr, int depth, int index) {
        if (depth == L) {
            if (isValidPassword(arr)) {
                for (int i = 0; i < arr.length; ++i) {
                    sb.append(arr[i]);
                }
                sb.append("\n");
            }
            return;
        }
        for (int j = index; j < C; ++j) {
            if (!visited[j]) {
                visited[j] = true;
                arr[depth] = map[j];
                backtracking(arr, depth + 1, j + 1);
                visited[j] = false;
            }
        }
    }

    private static boolean isValidPassword(char[] arr) {
        int consonantCount = 0;
        int vowelCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        return consonantCount >= 2 && vowelCount >= 1;
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}
