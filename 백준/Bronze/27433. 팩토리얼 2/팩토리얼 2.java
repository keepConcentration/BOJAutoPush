import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        long N = Long.parseLong(br.readLine());

        long result = factorial(N);
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return factorial(n - 1) * n;
    }
}