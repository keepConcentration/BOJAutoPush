import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger R = sc.nextBigInteger();
        BigInteger C = sc.nextBigInteger();
        BigInteger N = sc.nextBigInteger();
        BigInteger result = BigInteger.ZERO;
        
        if (!BigInteger.ZERO.equals(R.remainder(N))) {
            R = R.add(N);
        }
        if (!BigInteger.ZERO.equals(C.remainder(N))) {
            C = C.add(N);
        }
        
        
        result = (R.divide(N)).multiply(C.divide(N));
        System.out.println(result.toString());
        
    }
}