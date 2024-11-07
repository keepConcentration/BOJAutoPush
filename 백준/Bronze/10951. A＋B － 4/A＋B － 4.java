import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        while (sc.hasNextInt()) {
            int param1 = sc.nextInt();
            int param2 = sc.nextInt();
            result += param1 + param2 + "\n";
        }
        System.out.print(result);
    }
}