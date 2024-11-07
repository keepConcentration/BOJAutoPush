import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        br.close();

        compute(N);
        sb.append(count).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void compute(int n) {
        if (n == 1 || n == 3) {
            count = -1;
            return;
        }
        if (n % 5 == 0) {
            count += n / 5;
            return;
        } else {
            compute(n - 2);
            count++;
        }
    }
}