import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(strArr[i]);
        }

        int prevNum = Integer.MIN_VALUE;
        int index = N;
        for (int i = N - 1; i >= 0; --i) {
            if (prevNum < arr[i]) {
                prevNum = arr[i];
                index = i;
            } else {
                break;
            }
        }
        if (index == 0) {
            sb.append("-1\n");
        } else {
            int targetNum = arr[index - 1];
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = index; i < N; ++i) {
                if (targetNum < arr[i] && min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }

            if (index > 0) {
                arr[index - 1] = arr[minIndex];
                arr[minIndex] = targetNum;
            }
            for (int i = 0; i < index; ++i) {
                sb.append(arr[i]).append(" ");
            }
            for (int i = N - 1; i >= index; --i) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
