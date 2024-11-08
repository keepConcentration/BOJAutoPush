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

        for (int i = 0; i < N + 2; ++i) {
            for (int j = 0; j < N + 2; ++j) {
                if (i == 0 || i == N + 1 || j == 0 || j == N + 1) {
                    sb.append("@");
                } else {
                    sb.append(" ");
                }
                if (j == N + 1) {
                    sb.append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}