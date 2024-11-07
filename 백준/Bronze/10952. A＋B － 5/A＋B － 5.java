import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int hap = 1;
        while(hap != 0) {
            int param1 = sc.nextInt();
            int param2 = sc.nextInt();
            result += (hap = param1 + param2) != 0 ? hap + " " : "";
        }
        System.out.print(result);
    }
}