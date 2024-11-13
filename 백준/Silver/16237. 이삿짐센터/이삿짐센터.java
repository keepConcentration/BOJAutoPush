import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[6];

        int result = 0;
        for (int i = 1; i < 6; ++i) {
            arr[i] = parseInt(strArr[i - 1]);
        }

        result += arr[5];
        arr[5] = 0;

        result += arr[4];
        arr[1] = Math.max(0, arr[1] - arr[4]);
        arr[4] = 0;

        result += arr[3];
        if (arr[2] >= arr[3]) {
            arr[2] -= arr[3];
        } else {
            int remain = arr[3] - arr[2];
            arr[2] = 0;
            if (arr[1] >= remain * 2) {
                arr[1] -= remain * 2;
            } else {
                arr[1] = 0;
            }
        }
        arr[3] = 0;

        result += arr[2] / 2;
        int remain1 = arr[2] / 2;
        if (arr[1] >= remain1) {
            arr[1] -= remain1;
        } else {
            arr[1] = 0;
        }

        if (arr[2] % 2 == 1) {
            result++;
            if (arr[1] >= 3) {
                arr[1] -= 3;
            } else {
                arr[1] = 0;
            }
        }
        arr[2] = 0;

        result += arr[1] / 5;
        if (arr[1] % 5 != 0) {
            result++;
        }

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
