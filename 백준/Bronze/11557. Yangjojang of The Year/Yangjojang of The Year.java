import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        
        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int N = parseInt(br.readLine());
            
            int min = Integer.MIN_VALUE;
            String minStr = null;
            for (int i = 0; i < N; ++i) {
                String[] strArr = br.readLine().split(" ");
                int in = parseInt(strArr[1]);
                if (min < in) {
                    min = in;
                    minStr = strArr[0];
                }
            }
            sb.append(minStr).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
