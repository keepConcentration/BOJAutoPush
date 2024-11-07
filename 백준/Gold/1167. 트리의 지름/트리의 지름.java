import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static boolean[] visited;
    static List<Node>[] adjacentNodeListArr;
    static int maxNode = 0, maxLength = 0;

    static class Node {

        int val;

        int cost;

        Node(int val, int cost) {
            this.val = val;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        adjacentNodeListArr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; ++i) {
            String[] arr = br.readLine().split(" ");
            int val = Integer.parseInt(arr[0]);
            adjacentNodeListArr[val] = new ArrayList<>();
            for (int j = 1; j < arr.length - 1; j += 2) {
                Node node = new Node(Integer.parseInt(arr[j]), Integer.parseInt(arr[j + 1]));
                adjacentNodeListArr[val].add(node);
            }
        }

        dfs(1, 0);
        visited = new boolean[N + 1];
        dfs(maxNode, 0);
        sb.append(maxLength);


        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int index, int length) {
        visited[index] = true;
        if (maxLength < length) {
            maxNode = index;
            maxLength = length;
        }
        for (Node node : adjacentNodeListArr[index]) {
            if (!visited[node.val]) {
                dfs(node.val, node.cost + length);
            }
        }
    }
}