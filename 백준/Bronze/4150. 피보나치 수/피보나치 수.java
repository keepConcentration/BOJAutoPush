import java.io.*;
import java.math.BigInteger;

class Main {

    private static BigInteger[] memoization = new BigInteger[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        BigInteger N = new BigInteger(br.readLine());
        br.close();

        memoization[0] = BigInteger.ZERO;
        memoization[1] = BigInteger.ONE;

        BigInteger result = fibonacci(N);

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static BigInteger fibonacci(BigInteger n) {
        int intN = n.intValue();
        if (memoization[intN] != null) {
            return memoization[intN];
        }
        memoization[intN] = fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(new BigInteger("2"))));
        return memoization[intN];
    }
}