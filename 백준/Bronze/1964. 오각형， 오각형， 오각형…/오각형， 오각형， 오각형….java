import java.util.Scanner;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger result = BigInteger.ONE;
        int param = sc.nextInt();
        BigInteger add = BigInteger.ONE;
        for (int i = 1; i <= param; ++i) {
            add = add.add(new BigInteger("3"));
            result = result.add(add);
        }
        System.out.println(result.remainder(new BigInteger("45678")));
        
    }
}