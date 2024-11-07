import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 1; i <= loop; ++i) {
            System.out.println("Case #" + i + ": " + (sc.nextInt() + sc.nextInt()));
        }
    }
}