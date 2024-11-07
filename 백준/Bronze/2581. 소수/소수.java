import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loopMin = Integer.parseInt(br.readLine()),
            loopMax = Integer.parseInt(br.readLine()),
            min = Integer.MAX_VALUE,
            sum = 0;
        for (int i = loopMin; i <= loopMax; ++i) {
            if (i == 1) continue;
            if (i == 2) {
                min = 2;
                sum = 2;
            } else {
                boolean isPrimeNum = true;
                for (int j = i - 1; j > 1; --j) {
                    if (i % j == 0) {
                        isPrimeNum = false;
                        break;
                    }
                }
                if (isPrimeNum) {
                    if (min > i) min = i;
                    sum += i;
                }
            }
        }
        if (sum != 0) {
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
        } else {
            bw.write("-1");
        }
        bw.flush();
    }
}