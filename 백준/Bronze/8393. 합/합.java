import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        int loop = new Scanner(System.in).nextInt();
        for (int i = 1; i <= loop; ++i) {
            result += i;
        }
        System.out.print(result);
    }
}