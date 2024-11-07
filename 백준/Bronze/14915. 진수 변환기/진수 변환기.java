import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");

        int M = Integer.parseInt(in[0]);
        int N = Integer.parseInt(in[1]);
        if (M == 0) {
            sb.append("0");
        }
        while (M != 0) {
            sb.append(getNum(M % N));
            M /= N;
        }

        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
    }

    private static String getNum(int m) {
        if (m == 10) {
            return "A";
        }
        if (m == 11) {
            return "B";
        }
        if (m == 12) {
            return "C";
        }
        if (m == 13) {
            return "D";
        }
        if (m == 14) {
            return "E";
        }
        if (m == 15) {
            return "F";
        }
        return String.valueOf(m);
    }
}