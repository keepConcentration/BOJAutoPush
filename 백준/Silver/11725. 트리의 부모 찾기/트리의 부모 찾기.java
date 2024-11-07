import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static List<Node> nodeList = new ArrayList<>();

    static Integer[] parents;
    static boolean[] visited;

    static class Node {

        int val;

        List<Node> adjacentNodeList;

        Node(int val) {
            this.val = val;
            this.adjacentNodeList = new ArrayList<>();
        }

        Node(int val, Node adjacentNode) {
            this.val = val;
            this.adjacentNodeList = new ArrayList<>();
            adjacentNodeList.add(adjacentNode);
        }

        void addAdjacentNode(Node adjacentNode) {
            this.adjacentNodeList.add(adjacentNode);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        nodeList = new ArrayList<>();
        parents = new Integer[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; ++i) {
            Node node = new Node(i);
            nodeList.add(node);
        }

        for (int i = 0; i < N - 1; ++i) {
            String[] arr = br.readLine().split(" ");
            int val1 = Integer.parseInt(arr[0]);
            int val2 = Integer.parseInt(arr[1]);

            nodeList.get(val1).addAdjacentNode(nodeList.get(val2));
            nodeList.get(val2).addAdjacentNode(nodeList.get(val1));
        }

        dfs(1);

        for (int i = 2; i <= N; ++i) {
            sb.append(parents[i]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static void dfs(int val) {
        visited[val] = true;
        List<Node> adjacentNodeList = nodeList.get(val).adjacentNodeList;
        for (Node node : adjacentNodeList) {
            if (!visited[node.val]) {
                parents[node.val] = val;
                dfs(node.val);
            }
        }
    }
}