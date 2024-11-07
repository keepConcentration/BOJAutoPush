import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i = 1; i * i <= N; ++i) {
            count++;
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
