import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt() + sc.nextInt();
        
        if (b >= 60) {
            a += b / 60;
            b = b % 60;
        }
        if (a >= 24) {
            a = a % 24;
        }
        
        System.out.println(a + " " + b);
    }
}