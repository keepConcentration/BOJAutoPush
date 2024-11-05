import java.io.*;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static Integer[] maxHeap = new Integer[100001];
    static int lastIndex = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        while (N-- > 0) {
            String in = br.readLine();
            if ("0".equals(in)) {
                sb.append(poll()).append("\n");
                continue;
            }
            add(Integer.parseInt(in));
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int poll() {
        if (lastIndex == 0) {
            return 0;
        }
        int poll = maxHeap[1];
        maxHeap[1] = maxHeap[lastIndex];
        maxHeap[lastIndex--] = null;

        for (int i = 1; i * 2 <= lastIndex;) {
            int leftIndex = i * 2;
            int rightIndex = leftIndex + 1;

            if (maxHeap[rightIndex] == null) {
                if (maxHeap[leftIndex] < maxHeap[i]) {
                    break;
                }
                swap(leftIndex, i);
                i = leftIndex;
                continue;
            }

            if (maxHeap[leftIndex] < maxHeap[i] && maxHeap[rightIndex] < maxHeap[i]) {
                break;
            }
            if (maxHeap[leftIndex] < maxHeap[rightIndex]) {
                swap(i, rightIndex);
                i = rightIndex;
            } else {
                swap(i, leftIndex);
                i = leftIndex;
            }
        }

        return poll;
    }

    private static void add(int a) {
        maxHeap[++lastIndex] = a;
        for (int i = lastIndex; i / 2 > 0;) {
            int parentIndex = i / 2;
            if (maxHeap[i] > maxHeap[parentIndex]) {
                swap(i, parentIndex);
                i = parentIndex;
            } else {
                break;
            }
        }
    }

    private static void swap(int a, int b) {
        int temp = maxHeap[a];
        maxHeap[a] = maxHeap[b];
        maxHeap[b] = temp;
    }
}