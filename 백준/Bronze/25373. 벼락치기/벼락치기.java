import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long in = Long.parseLong(br.readLine());
        if (in < 2) {
            bw.write("1");
        } else if (in < 4) {
            bw.write("2");
        } else if (in < 7) {
            bw.write("3");
        } else if (in < 11) {
            bw.write("4");
        } else if (in < 16) {
            bw.write("5");
        } else if (in < 22) {
            bw.write("6");
        } else {
            if (in % 7 != 0) {
                bw.write(String.valueOf(in / 7 + 4));
            } else {
                bw.write(String.valueOf(in / 7 + 3));
            }
        }

        bw.flush();
        bw.close();
    }
}