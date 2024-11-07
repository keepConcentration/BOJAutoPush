import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1;; ++i) {
            if (i * i + i + 1 == N) {
                sb.append(i);
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}