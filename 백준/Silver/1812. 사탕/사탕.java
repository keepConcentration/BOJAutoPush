import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(br.readLine());
            if (i % 2 == 0) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }

        int[] resultArr = new int[N];
        resultArr[0] = sum / 2;
        for (int i = 1; i < N; ++i) {
            resultArr[i] = arr[i - 1] - resultArr[i - 1];
        }

        for (int i = 0; i < N; ++i) {
            sb.append(resultArr[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
