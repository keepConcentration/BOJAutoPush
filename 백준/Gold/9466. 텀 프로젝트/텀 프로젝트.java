import java.io.*;
import java.util.ArrayList;

class Main {

    static ArrayList<Integer> adjacentNodeList;

    static int N;

    static boolean[] finished;

    static boolean[] visited;

    static int count;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            count = 0;
            finished = new boolean[N + 1];
            visited = new boolean[N + 1];
            adjacentNodeList = new ArrayList<>();
            adjacentNodeList.add(0, -1);

            String[] arr = br.readLine().split(" ");
            for (int i = 1; i <= N; ++i) {
                adjacentNodeList.add(i, Integer.parseInt(arr[i - 1]));
            }
            for (int i = 1; i <= N; ++i) {
                if (!finished[i]) {
                    dfs(i);
                }
            }

            sb.append(N - count).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int n) {
        visited[n] = true;
        int next = adjacentNodeList.get(n);

        if (!visited[next]) {
            dfs(next);
        } else if (!finished[next]) {
            count++;
            for (int i = next; i != n; i = adjacentNodeList.get(i)) {
                count++;
            }
        }
        finished[n] = true;
    }
}