import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;

    static int[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);
        tree = new int[N];

        arr = br.readLine().split(" ");
        long max = 0;
        for (int i = 0; i < N; ++i) {
            tree[i] = Integer.parseInt(arr[i]);
            if (max < tree[i]) {
                max = tree[i];
            }
        }

        long min = 0;
        long mid = 0;
        while (min < max) {
            mid = (max + min) / 2;

            long length = 0;
            for (int i = 0; i < N; ++i) {
                if (tree[i] > mid) {
                    length += tree[i] - mid;
                }
            }

            if (length < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        sb.append(min - 1);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}