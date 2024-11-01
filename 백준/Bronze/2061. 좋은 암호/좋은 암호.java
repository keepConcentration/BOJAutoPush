import java.io.*;
import java.math.BigInteger;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        BigInteger K = new BigInteger(arr[0]);
        BigInteger L = new BigInteger(arr[1]);
        int lInt = L.intValue();
        int divide = 0;
        for (int i = 2; i < lInt; ++i) {
            BigInteger iBig = BigInteger.valueOf(i);
            if (K.remainder(iBig).compareTo(BigInteger.ZERO) == 0) {
                divide = i;
                break;
            }
        }
        if (divide == 0) {
            sb.append("GOOD");
        } else {
            sb.append("BAD ").append(divide);
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}