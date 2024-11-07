import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; ++i) {
            int blank = N - i;
            for (int j = 0; j < blank; ++j) {
                sb.append(" ");
            }

            for (int j = 0; j < i * 2 - 1; ++j) {
                if (i == N) {
                    sb.append("*");
                } else {
                    if (j == 0 || j == (i * 2 - 2)) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}