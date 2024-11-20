import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int M = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[M];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < M; ++i) {
            arr[i] = parseInt(strArr[i]);
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int K = parseInt(br.readLine());

        if (M == 1 || K == 1 ) {
            sb.append("1.0\n");
        } else {
            double total = 1;
            for (int i = 0; i < K; ++i) {
                total *= sum;
                sum--;
            }

            double sumNum = 0;
            for (int i = 0; i < M; ++i) {
                int num = arr[i];
                if (num < K) {
                    continue;
                }

                double sum2 = 1;
                for (int j = 0; j < K; ++j) {
                    sum2 *= num;
                    num--;
                }
                sumNum += sum2;
            }
            sb.append(sumNum / total);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
