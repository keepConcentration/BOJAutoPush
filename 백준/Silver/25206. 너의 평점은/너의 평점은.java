import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double total = 0.0;
        double result = 0.0;
        for (int i = 0; i < 20; ++i) {
            String[] in = br.readLine().split(" ");
            if ("P".equals(in[2])) {
                continue;
            }
            double num = Double.parseDouble(in[1]);
            double score = getScore(in[2]);
            total += num;

            result += num * score;

        }
        result /= total;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static double getScore(String a) {
        if (a.equals("A+")) {
            return 4.5;
        }
        if (a.equals("A0")) {
            return 4.0;
        }
        if (a.equals("B+")) {
            return 3.5;
        }
        if (a.equals("B0")) {
            return 3.0;
        }
        if (a.equals("C+")) {
            return 2.5;
        }
        if (a.equals("C0")) {
            return 2.0;
        }
        if (a.equals("D+")) {
            return 1.5;
        }
        if (a.equals("D0")) {
            return 1.0;
        }
        return 0.0;
    }
}    