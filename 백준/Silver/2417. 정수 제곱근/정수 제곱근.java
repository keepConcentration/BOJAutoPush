import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        final BigInteger in = new BigInteger(br.readLine());
        final BigInteger two = new BigInteger("2");
        BigInteger left = BigInteger.ZERO;
        BigInteger right = in;
        
        while (left.compareTo(right) == -1) {
            BigInteger mid = (left.add(right)).divide(two);
            BigInteger pow = mid.pow(2);
            if (in.equals(pow)) {
                left = mid;
                break;
            }
            if (in.compareTo(pow) == -1) {
                right = mid;
            } else {
                left = mid.add(BigInteger.ONE);
            }
            
        }
        sb.append(left.toString());
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}