import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < N; ++i) {
            String[] arr = br.readLine().split(" ");
            int C = Integer.parseInt(arr[0]);
            int K = Integer.parseInt(arr[1]);
            result += C * K;
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
