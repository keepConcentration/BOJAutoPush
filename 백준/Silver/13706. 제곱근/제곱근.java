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
        
        BigInteger in = new BigInteger(br.readLine());
        
        BigInteger left = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        
        BigInteger right = in;
        
        while (left.compareTo(right) != 1) {
            BigInteger mid = (left.add(right)).divide(two);
            BigInteger midMultiply = mid.multiply(mid);
            
            int compare = midMultiply.compareTo(in);
            if (compare == 0) {
                sb.append(mid.toString()).append("\n");
                break;
            } else if (compare == -1) {
                left = mid.add(BigInteger.ONE);
            } else {
                right = mid.subtract(BigInteger.ONE);
            }
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}