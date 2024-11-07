import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String[] in = br.readLine().split(" ");
        BigInteger a = new BigInteger(in[0]);
        BigInteger b = new BigInteger(in[1]);
        
        BigInteger result1 = a.abs().divide(b.abs());
        BigInteger result2 = ZERO;
        
        boolean isMinus = false;
        
        if (in[0].indexOf("-") != -1) {
            result1 = result1.add(ONE);
            result2 = b.abs().multiply(result1).subtract(a.abs());
            isMinus = !isMinus;
        } else {
            result2 = a.abs().remainder(b.abs());
        }
        if (in[1].indexOf("-") != -1) {
            isMinus = !isMinus;
        }
        
        if (isMinus) {
            result1 = result1.multiply(new BigInteger("-1"));
        }
        
        if (in[0].equals("0")) {
            sb.append("0\n0\n");
        } else {
            sb.append(result1.toString());
            sb.append("\n");
            sb.append(result2.toString());
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}