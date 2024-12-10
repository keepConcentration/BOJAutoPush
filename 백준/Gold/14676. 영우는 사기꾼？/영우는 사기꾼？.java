import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M, K;
    static List<Integer>[] adjacencyList;
    static List<Integer>[] backAdjacencyList;
    static int[] count;
    static int[] beforeBuildCount;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);
        K = parseInt(strArr[2]);

        adjacencyList = new ArrayList[N + 1];
        backAdjacencyList = new ArrayList[N + 1];
        count = new int[N + 1];
        beforeBuildCount = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
            backAdjacencyList[i] = new ArrayList<>();
        }
        while (M-- > 0) {
            strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);
            adjacencyList[startNode].add(endNode);
            backAdjacencyList[endNode].add(startNode);
            beforeBuildCount[endNode]++;
        }
        boolean result = true;

        while (K-- > 0) {
            strArr = br.readLine().split(" ");
            if (!result) {
                continue;
            }
            int num = parseInt(strArr[1]);
            if ("1".equals(strArr[0])) {
                if (beforeBuildCount[num] == 0) {
                    count[num]++;
                    if (count[num] == 1) {
                        for (int adjacencyNode : adjacencyList[num]) {
                            beforeBuildCount[adjacencyNode] = Math.max(0, beforeBuildCount[adjacencyNode] - 1);
                        }
                    }
                } else {
                    result = false;
                }
            } else {
                if (count[num] != 0) {
                    count[num]--;
                    if (count[num] == 0) {
                        for (int adjacencyNode : adjacencyList[num]) {
                            beforeBuildCount[adjacencyNode]++;
                        }
                    }
                } else {
                    result = false;
                }
            }
        }

        if (result) {
            sb.append("King-God-Emperor\n");
        } else {
            sb.append("Lier!\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
