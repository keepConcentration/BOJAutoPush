import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] in = br.readLine().toCharArray();
        int size = in.length;
        int result = 0;
        for (int i = 0; i < size; ++i) {
            if (in[i] == 'a' || in[i] == 'e' || in[i] == 'i' || in[i] == 'o' || in[i] == 'u') {
                result++;
            }
        }
        sb.append(result).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
