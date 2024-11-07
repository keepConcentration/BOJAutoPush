import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";
        
        if (a >= 3 && b <= 4) {
            result += "TroyMartian\n";
        }
        if (a <= 6 && b >= 2) {
            result += "VladSaturnian\n";
        }
        if (a <= 2 && b <= 3) {
            result += "GraemeMercurian\n";
        }
        System.out.print(result);
    }
}