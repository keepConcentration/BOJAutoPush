import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a = new BigInteger(br.readLine(), 2).multiply(new BigInteger("17"));
        BigInteger two = new BigInteger("2");
        StringBuilder sb = new StringBuilder();
        
        while (a.compareTo(two) != -1) {
            BigInteger remainder = a.remainder(two);
            
            sb.append(remainder);
            a = a.divide(two);
        }
        sb.append(a);
        sb = sb.reverse();
        System.out.println(sb.toString());
    }
}