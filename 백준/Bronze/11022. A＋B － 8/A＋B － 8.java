import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 1; i <= loop; ++i) {
            int param1 = sc.nextInt();
            int param2 = sc.nextInt();
            System.out.println("Case #" + i + ": " + param1 + " + " + param2 + " = " + (param1 + param2));
        }
    }
}