import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, K;

    static int[] line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        K = Integer.parseInt(arr[0]);
        N = Integer.parseInt(arr[1]);
        line = new int[K];


        long max = 0;
        for (int i = 0; i < K; ++i) {
            line[i] = Integer.parseInt(br.readLine());
            if (max < line[i]) {
                max = line[i];
            }
        }
        max++;

        long mid = 0;
        long min = 0;
        while (min < max) {
            mid = (min + max) / 2;

            int count = 0;
            for (int i = 0; i < K; ++i) {
                count += line[i] / mid;
            }
            if (count < N) {
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