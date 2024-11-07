import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int plus = 1;
        int result = 0;
        
        for (int i = 0; i <= N; ++i) {
            result += plus;
            if (i % 2 == 1) {
                plus++;
            } 
        }
        System.out.println(result);
    }
}