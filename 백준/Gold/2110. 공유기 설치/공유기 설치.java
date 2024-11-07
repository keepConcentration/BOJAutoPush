import java.io.*;
import java.util.Arrays;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, C;

    static int[] x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        C = Integer.parseInt(arr[1]);
        x = new int[N];

        for (int i = 0; i < N; ++i) {
            x[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(x);

        long min = 0;
        long mid = 0;
        long max = x[N - 1] + 1;
        while (min < max) {
            mid = (max + min) / 2;
            long count = 1;
            long lastSetupX = x[0];
            for (int i = 1; i < N; ++i) {
                if (x[i] - lastSetupX >= mid) {
                    count++;
                    lastSetupX = x[i];
                }
            }

            if (count < C) {
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