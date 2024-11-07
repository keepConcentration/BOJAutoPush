import java.io.*;
import java.util.Arrays;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += (N - i) * arr[i];
        }
        sb.append(sum);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}