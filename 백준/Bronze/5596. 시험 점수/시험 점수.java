import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int b = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        
        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}