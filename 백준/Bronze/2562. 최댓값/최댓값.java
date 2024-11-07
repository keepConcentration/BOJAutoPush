import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE,
            idx = 0;
        for (int i = 1; i <= 9; ++i) {
            int input = sc.nextInt();
            if (input > max) {
                max = input;
                idx = i;
            }
        }
        System.out.print(max + "\n" + idx);
    }
}