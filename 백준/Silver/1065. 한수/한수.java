import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int param = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int result = 99;
        if (param < 100) {
            bw.write(String.valueOf(param));
        } else if (param == 1000) {
            bw.write("144");
        } else {
            for (int i = 100; i <= param; ++i) {
                int hund = i / 100,
                    ten  = i / 10 % 10,
                    one  = i % 10;
                if ((double)(hund + one) / 2 == (double)ten) {
                    ++result;
                }
            }
            bw.write(String.valueOf(result));
        }
        bw.flush();
    }
}