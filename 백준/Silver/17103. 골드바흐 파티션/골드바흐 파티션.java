import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[1_000_001];

        for (int i = 2; i < arr.length; ++i) {
            if (!arr[i]) {
                for (int j = 2; i * j < arr.length; ++j) {
                    arr[i * j] = true;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; ++i) {
            int count = 0;
            int in = Integer.parseInt(br.readLine());
            for (int j = 2; j <= in / 2; ++j) {
                if (!arr[j]) {
                    if (!arr[in - j]) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        br.close();

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
