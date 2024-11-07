import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int add = sc.nextInt();
        int subtract = sc.nextInt();
        
        if (add - subtract < 0) {
            System.out.println(-1);
            return;
        } else if ((add + subtract) % 2 == 0) {
            System.out.println((add + subtract) / 2 + " " + ((add - subtract) / 2));
        } else {
            System.out.println(-1);
        }
    }
}