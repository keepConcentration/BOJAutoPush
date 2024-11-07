import java.math.BigInteger;
import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int result = 1;
        
        for (int i = 0; i < loop; ++i) {
            int change1 = sc.nextInt();
            int change2 = sc.nextInt();
            if (change1 == result) {
                result = change2;
            } else if (change2 == result) {
                result = change1;
            }
        }
        System.out.println(result);
    }
}