import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = new BigInteger("1000000007");
        System.out.println(pow(a, b, c).remainder(c));
        
    }
    
    public static BigInteger pow(BigInteger a, BigInteger b, BigInteger c) {
        if (b.compareTo(BigInteger.ONE) == 0) {
            return a;
        } else if (b.remainder(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
            BigInteger n = pow(a, b.divide(new BigInteger("2")), c).remainder(c);
            return (n.multiply(n)).remainder(c);
        } else {
            BigInteger n = pow(a, b.divide(new BigInteger("2")), c).remainder(c);
            return (((n.multiply(n)).remainder(c)).multiply(a)).remainder(c);
        }
    }
}
