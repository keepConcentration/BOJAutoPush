import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int[] arr;

    static int N, K;

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        N = parseInt(strArr[0]);
        K = parseInt(strArr[1]);

        arr = new int[N];
        strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(strArr[i]);
        }

        selectionSort();
        if (count < K) {
            sb.append("-1\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void selectionSort() {
        for (int i = arr.length - 1; i >= 0; --i) {
            int max = 0;
            int maxIdx = 0;
            for (int j = 0; j < i; ++j) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            if (arr[i] < max) {
                int temp = arr[i];
                arr[i] = max;
                arr[maxIdx] = temp;
                count++;

                if (count == K) {
                    for (int j = 0; j < arr.length; ++j) {
                        sb.append(arr[j]).append(" ");
                    }
                    return;
                } else if (count > K) {
                    return;
                }
            }
        }
    }
}
