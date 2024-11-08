import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if (N % 2 == 0) {
            for (int i = 0; i < N; ++i) {
                sb.append(i % 2 == 0 ? 1 : 2).append(" ");
            }
        } else {
            for (int i = 0; i < N - 1; ++i) {
                sb.append(i % 2 == 0 ? 1 : 2).append(" ");
            }
            sb.append("3");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}