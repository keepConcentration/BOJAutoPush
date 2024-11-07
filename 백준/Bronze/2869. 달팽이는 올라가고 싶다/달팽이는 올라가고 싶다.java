import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long up = Long.parseLong(st.nextToken()),
             down = Long.parseLong(st.nextToken()),
             height = Long.parseLong(st.nextToken()) - up;
        bw.write(String.valueOf((long)Math.ceil((double)height / (double)(up - down)) + 1));
        bw.flush();
    }
}