import java.util.Scanner;
import java.math.BigDecimal;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal b = new BigDecimal("2");
        b = b.pow(n);
        System.out.println(BigDecimal.ONE.divide(b).toPlainString());
    }
}