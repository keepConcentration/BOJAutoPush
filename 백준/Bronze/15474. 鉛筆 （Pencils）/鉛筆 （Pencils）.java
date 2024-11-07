import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int AA = N % A != 0 ? (N / A + 1) : N / A;
        int CC = N % C != 0 ? (N / C + 1) : N / C;
        
        if ((AA * B) < (CC * D)) {
            System.out.println(AA * B);
        } else {
            System.out.println(CC * D);
        }
        
    }
}