import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, M;

    static Integer[] priorityQueue;

    static int lastIndex;
    static List<Integer>[] adjacentNodeListArr;
    static int[] edgeArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        M = parseInt(strArr[1]);

        adjacentNodeListArr = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacentNodeListArr[i] = new ArrayList<>();
        }

        lastIndex = 0;
        priorityQueue = new Integer[N + 1];
        edgeArr = new int[N + 1];
        for (int i = 1; i <= M; ++i) {
            strArr = br.readLine().split(" ");
            int start = parseInt(strArr[0]);
            int end = parseInt(strArr[1]);
            adjacentNodeListArr[start].add(end);

            edgeArr[end]++;
        }

        for (int i = 1; i <= N; ++i) {
            if (edgeArr[i] == 0) {
                add(i);
            }
        }

        while (!isEmpty()) {
            int poll = poll();
            for (int adjacentNode : adjacentNodeListArr[poll]) {
                edgeArr[adjacentNode]--;
                if (edgeArr[adjacentNode] == 0) {
                    add(adjacentNode);
                }
            }
            sb.append(poll).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1).append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int poll() {
        if (lastIndex == 0) {
            return 0;
        }
        int poll = priorityQueue[1];
        priorityQueue[1] = priorityQueue[lastIndex];
        priorityQueue[lastIndex--] = null;

        for (int i = 1; i * 2 <= lastIndex;) {
            int leftIndex = i * 2;
            int rightIndex = i * 2 + 1;
            if (priorityQueue[rightIndex] == null) {
                if (priorityQueue[leftIndex] == null) {
                    break;
                }
                if (priorityQueue[i] < priorityQueue[leftIndex]) {
                    break;
                }
                swap(i, leftIndex);
                break;
            }
            int left = priorityQueue[leftIndex];
            int right = priorityQueue[rightIndex];

            if (priorityQueue[i] < left && priorityQueue[i] < right) {
                break;
            }

            if (left < right) {
                swap(leftIndex, i);
                i = leftIndex;
            } else {
                swap(rightIndex, i);
                i = rightIndex;
            }
        }
        return poll;
    }

    private static void add(int a) {
        lastIndex++;
        priorityQueue[lastIndex] = a;
        for (int i = lastIndex; i / 2 >= 1;) {
            int parentIndex = i / 2;
            if (priorityQueue[i] < priorityQueue[parentIndex]) {
                swap(i, parentIndex);
                i = parentIndex;
            } else {
                break;
            }
        }
    }

    private static boolean isEmpty() {
        return lastIndex == 0;
    }

    private static void swap(int left ,int right) {
        int temp = priorityQueue[left];
        priorityQueue[left] = priorityQueue[right];
        priorityQueue[right] = temp;
    }
}