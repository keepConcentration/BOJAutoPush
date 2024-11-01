import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static Integer[] minHeap;

    static int lastIndex = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        minHeap = new Integer[100001];

        for (int i = 0; i < N; ++i) {
            int in = Integer.parseInt(br.readLine());
            if (in == 0) {
                sb.append(poll()).append("\n");
            } else {
                add(in);
            }
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
        int result = minHeap[1];
        minHeap[1] = minHeap[lastIndex];
        minHeap[lastIndex--] = null;

        for (int i = 1; i * 2 <= lastIndex;) {
            int leftIndex = i * 2;
            int rightIndex = i * 2 + 1;
            if (minHeap[rightIndex] == null) {
                if (minHeap[i] < minHeap[leftIndex]) {
                    break;
                }
                swap(i, leftIndex);
                break;
            }
            if (minHeap[i] < minHeap[leftIndex] && minHeap[i] < minHeap[rightIndex]) {
                break;
            }
            if (minHeap[leftIndex] < minHeap[rightIndex]) {
                swap(i, leftIndex);
                i = leftIndex;
            } else {
                swap(i, rightIndex);
                i = rightIndex;
            }
        }
        return result;
    }

    private static void add(int n) {
        minHeap[++lastIndex] = n;
        int prevIndex = lastIndex;
        for (int i = lastIndex / 2; i > 0;) {
            if (minHeap[i] <= n) {
                break;
            }
            swap(i, prevIndex);
            prevIndex = i;
            i /= 2;
        }
    }

    private static void swap(int idx1, int idx2) {
        int temp = minHeap[idx1];
        minHeap[idx1] = minHeap[idx2];
        minHeap[idx2] = temp;
    }
}