import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; ++i) {
            int in = Integer.parseInt(br.readLine());
            sb.append(in / 25).append(" ");
            in %= 25;
            sb.append(in / 10).append(" ");
            in %= 10;
            sb.append(in / 5).append(" ");
            in %= 5;
            sb.append(in).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}