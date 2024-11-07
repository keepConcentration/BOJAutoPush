import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;

class Main {

    static HashSet<Integer>[] adjacentNodeSetArray;

    static boolean[] visitedArr;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        adjacentNodeSetArray = new HashSet[N + 1];
        visitedArr = new boolean[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacentNodeSetArray[i] = new HashSet<>();
        }

        for (int i = 0; i < M; ++i) {
            arr = br.readLine().split(" ");
            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);

            if (!adjacentNodeSetArray[u].contains(v)) {
                adjacentNodeSetArray[u].add(v);
            }
            if (!adjacentNodeSetArray[v].contains(u)) {
                adjacentNodeSetArray[v].add(u);
            }
        }
        int result = 0;
        for (int i = 1; i <= N; ++i) {
            if (!visitedArr[i]) {
                dfs(i);
                result++;
            }
        }
        sb.append(result);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int node) {
        if (visitedArr[node]) {
            return;
        }
        visitedArr[node] = true;
        HashSet<Integer> adjacentNodeSet = adjacentNodeSetArray[node];

        for (Integer adjacentNode : adjacentNodeSet) {
            if (!visitedArr[adjacentNode]) {
                dfs(adjacentNode);
            }
        }
    }
}