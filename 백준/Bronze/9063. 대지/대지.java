import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int xMax = Integer.MIN_VALUE,
                xMin = Integer.MAX_VALUE,
                yMax = Integer.MIN_VALUE,
                yMin = Integer.MAX_VALUE;

        for (int i = 0; i < N; ++i) {
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);

            if (x < xMin) {
                xMin = x;
            }
            if (x > xMax) {
                xMax = x;
            }
            if (y < yMin) {
                yMin = y;
            }
            if (y > yMax) {
                yMax = y;
            }
        }
        br.close();

        sb.append((xMax - xMin) * (yMax - yMin));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}