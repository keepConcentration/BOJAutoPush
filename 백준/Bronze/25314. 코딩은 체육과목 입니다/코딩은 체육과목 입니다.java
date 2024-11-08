import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        final String longText = "long ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine()) / 4;

        for (int i = 0; i < count; ++i) {
            bw.write(longText);
        }
        bw.write("int\n");
        bw.flush();
        bw.close();
        br.close();
    }
}