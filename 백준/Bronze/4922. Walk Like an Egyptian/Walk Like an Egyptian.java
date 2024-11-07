import java.io.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int in;
        while ((in = Integer.parseInt(br.readLine())) != 0) {
            int i = IntStream.range(1, in).sum() * 2 + 1;
            bw.write(String.valueOf(in));
            bw.write(" => ");
            bw.write(String.valueOf(i));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}