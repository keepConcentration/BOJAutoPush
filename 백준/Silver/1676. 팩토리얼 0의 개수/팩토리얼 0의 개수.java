import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        final int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        BigInteger compute = BigInteger.ONE;
        BigInteger five = new BigInteger("5");
        BigInteger two = new BigInteger("2");
        int[] memoization = new int[501];
        for (int i = N; i >= 2; --i) {
            int tempI = i;
            if (memoization[i] != 0) {
                result += memoization[i];
                continue;
            }
            while (tempI % 10 == 0) {
                memoization[i]++;
                result++;
                tempI /= 10;
            }
            
            while (tempI % 5 == 0) {
                if (compute.mod(two).equals(BigInteger.ZERO)) {
                    compute = compute.divide(two);
                    memoization[i]++;
                    result++;
                } else {
                    compute = compute.multiply(five);
                }
                tempI /= 5;
            }
            
            while (tempI % 2 == 0) {
                if (compute.mod(five).equals(BigInteger.ZERO)) {
                    compute = compute.divide(five);
                    memoization[i]++;
                    result++;
                } else {
                    compute = compute.multiply(two);
                }
                tempI /= 2;
            }
        }
        
        sb.append(result).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}