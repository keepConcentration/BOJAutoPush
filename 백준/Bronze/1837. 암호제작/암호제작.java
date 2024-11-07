import java.math.BigInteger;
import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger target = sc.nextBigInteger();
        
        BigInteger max = sc.nextBigInteger();
        String result = "GOOD";
        
        BigInteger divide = new BigInteger("2");
        while (divide.compareTo(max) == -1) {
            if (target.remainder(divide).compareTo(BigInteger.ZERO) == 0) {
                target = target.divide(divide);
                if (target.compareTo(divide) == -1) {
                    result = "BAD " + target;
                } else {
                    result = "BAD " + divide;
                }
                break;
            } else {
                divide = divide.add(BigInteger.ONE);
            }
        }
        System.out.println(result);
    }
}