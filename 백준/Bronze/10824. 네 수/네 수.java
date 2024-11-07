import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String AB = st.nextToken() + st.nextToken();
        String CD = st.nextToken() + st.nextToken();

        sb.append(Long.parseLong(AB) + Long.parseLong(CD));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}