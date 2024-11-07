import java.util.Scanner;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String result = "";
        for (int i = 0; i < loop; ++i) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            BigInteger compA = a;
            BigInteger compB = b;
            while (compB.compareTo(BigInteger.ZERO) != 0) {
                BigInteger r = compA.remainder(compB);
                compA = compB;
                compB = r;
            }
            
            result += a.multiply(b).divide(compA).toString() + "\n";
        }
        System.out.print(result);
    }
}