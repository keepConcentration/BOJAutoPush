import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int[] arr = IntStream.range(0, N + 1)
                .toArray();

        for (int i = 0; i < M; ++i) {
            in = br.readLine().split(" ");
            int firstIndex = Integer.parseInt(in[0]);
            int secondIndex = Integer.parseInt(in[1]);

            int first = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = first;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; ++i) {
            sb.append(arr[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}