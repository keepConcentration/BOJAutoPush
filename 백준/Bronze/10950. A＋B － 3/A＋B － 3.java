import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[sc.nextInt()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = sc.nextInt() + sc.nextInt();
        }
        
        for (int i = 0; i < result.length; ++i) {
            System.out.println(result[i]);
        }
    }
}