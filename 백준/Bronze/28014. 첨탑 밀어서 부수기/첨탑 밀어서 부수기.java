import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int result = 0;
        int height = 0;
        for (int i = 0; i < N; ++i) {
            int next = parseInt(strArr[i]);
            if (next >= height) {
                result++;
            }
            height = next;
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
