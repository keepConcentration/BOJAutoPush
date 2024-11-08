import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] in = br.readLine().split(" ");

            sb.append(Integer.parseInt(in[0]) * (Integer.parseInt(in[2]) - 1) + Integer.parseInt(in[1])).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}