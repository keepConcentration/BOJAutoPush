import java.util.Scanner;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(),
            b = sc.nextBigInteger();
        
        System.out.println(a.multiply(b).divide(new BigInteger("2")));
    }
}