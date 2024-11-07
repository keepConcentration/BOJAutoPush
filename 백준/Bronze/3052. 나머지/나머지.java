import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] params = new int[10];
        int result = 10;
        for (int i = 0; i < 10; ++i) {
            params[i] = sc.nextInt() % 42;
        }
        for (int i = 0; i < 9; ++i) {
            for (int j = i + 1; j < 10; ++j) {
                if (params[j] == 43) continue;
                if (params[i] == params[j]) {
                    --result;
                    params[j] = 43;
                }
            }
        }
        System.out.print(result);
    }
}