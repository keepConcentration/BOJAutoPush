import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt(),
            target = sc.nextInt();
        String result = "";
        for (int i = 0; i < loop; ++i) {
            int param = sc.nextInt();
            result += param < target ? param + " " : "";
        }
        System.out.println(result);
    }
}