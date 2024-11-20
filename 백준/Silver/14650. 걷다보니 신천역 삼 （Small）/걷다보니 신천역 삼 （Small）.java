import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int result;
    static int N;

    public static void main(String[] args) throws IOException {

        N = parseInt(br.readLine());
        dfs("1", 1);
        dfs("2", 1);

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(String num, int depth) {
        if (depth == N) {
            if (parseInt(num) % 3 == 0) {
                result++;
            }
            return;
        }

        dfs(num + "0", depth + 1);
        dfs(num + "1", depth + 1);
        dfs(num + "2", depth + 1);
    }
}
