import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";
        
        if (a == 0 && b == 0) {
            result = "Not a moose";
        } else if (a == b) {
            result = "Even " + (a + b);
        } else {
            if (a < b) {
                result = "Odd " + (b * 2);
            } else {
                result = "Odd " + (a * 2);
            }
        }
        
        System.out.println(result);
    }
}