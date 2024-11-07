import java.util.Scanner;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger car = sc.nextBigInteger();
        BigInteger fly = sc.nextBigInteger();
        BigInteger w = sc.nextBigInteger();
        
        BigInteger H = w.divide(car.multiply(new BigInteger("2")));
        
        System.out.println(fly.multiply(H).toString());
    }
}