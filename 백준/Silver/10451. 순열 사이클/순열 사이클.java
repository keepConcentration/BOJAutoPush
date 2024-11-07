import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;

class Main {

    static LinkedList<Integer> adjacentNodeList;

    static boolean[] visitedArr;

    static int N;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            adjacentNodeList = new LinkedList<>();
            visitedArr = new boolean[N + 1];
            adjacentNodeList.add(0, -1);

            String[] arr = br.readLine().split(" ");
            for (int i = 1; i <= N; ++i) {
                adjacentNodeList.add(i, Integer.parseInt(arr[i - 1]));
            }

            int result = 0;
            for (int i = 1; i <= N; ++i) {
                if (!visitedArr[i]) {
                    result += dfs(i);
                }
            }
            sb.append(result).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int dfs(int node) {
        if (visitedArr[node]) {
            return 1;
        }
        visitedArr[node] = true;
        int nextNode = adjacentNodeList.get(node);
        return dfs(nextNode);
    }
}