import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static List<Integer>[] adjacencyList;

    static int[] edges;

    static int[] result;

    static HashMap<Integer, HashMap<Integer, Integer>> hashMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = parseInt(br.readLine());

        while (T-- > 0) {
            String[] strArr = br.readLine().split(" ");
            String K = strArr[0];
            int M = parseInt(strArr[1]);
            int P = parseInt(strArr[2]);

            edges = new int[M + 1];
            adjacencyList = new ArrayList[M + 1];
            result = new int[M + 1];
            hashMap = new HashMap();

            for (int i = 1; i <= M; ++i) {
                adjacencyList[i] = new ArrayList<>();
                hashMap.put(i, new HashMap<>());
            }
            for (int i = 0; i < P; ++i) {
                strArr = br.readLine().split(" ");
                int startNode = parseInt(strArr[0]);
                int endNode = parseInt(strArr[1]);
                adjacencyList[startNode].add(endNode);
                edges[endNode]++;
            }

            Queue<int[]> queue = new LinkedList<>();
            for (int i = 1; i <= M; ++i) {
                if (edges[i] == 0) {
                    queue.offer(new int[] {i, 1});
                    result[i] = 1;
                }
            }

            int max = 0;

            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                int node = poll[0];
                int weight = poll[1];

                for (int adjacencyNode : adjacencyList[node]) {
                    int weightCount = hashMap.get(adjacencyNode).getOrDefault(weight, 0);
                    hashMap.get(adjacencyNode).put(weight, weightCount + 1);
                    edges[adjacencyNode]--;
                    if (edges[adjacencyNode] == 0) {
                        HashMap<Integer, Integer> weightMap = hashMap.get(adjacencyNode);
                        int maxWeight = 0;
                        Set<Integer> keySet = weightMap.keySet();
                        for (int key : keySet) {
                            maxWeight = Math.max(maxWeight, key);
                        }
                        int maxCount = weightMap.get(maxWeight);
                        if (maxCount > 1) {
                            queue.offer(new int[] {adjacencyNode, maxWeight + 1});
                            max = Math.max(max, maxWeight + 1);
                        } else {
                            queue.offer(new int[] {adjacencyNode, maxWeight});
                            max = Math.max(max, maxWeight);
                        }
                    }
                }
            }

            sb.append(K).append(" ").append(max).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}