import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        int result2 = N < 3 ? 1 : N - 2;
        Integer[] f = new Integer[N + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= N; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        bw.write(f[N] + " " + result2);
        bw.flush();
        bw.close();
    }
}