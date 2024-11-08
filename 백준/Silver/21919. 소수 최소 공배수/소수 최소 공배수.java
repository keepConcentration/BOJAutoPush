import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        boolean[] prime = new boolean[1_000_001];
        prime[0] = prime[1] = true;
        for (int i = 2; i < Math.sqrt(1_000_001); ++i) {
            if (prime[i] == true) {
                continue;
            }

            for (int j = i + i; j < 1_000_001; j += i) {
                prime[j] = true;
            }
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        long result = -1;
        for (int i = 0; i < N; ++i) {
            if (prime[arr[i]] == true) {
                continue;
            }

            if (result == -1) {
                result = arr[i];
            } else {
                long a = result;
                long b = arr[i];
                if (a < b) {
                    long temp = a;
                    a = b;
                    b = temp;
                }

                while (b != 0) {
                    long temp = a % b;
                    a = b;
                    b = temp;
                }
                result = result * arr[i] / a;
            }
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}