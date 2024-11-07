import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] params = new int[8];
        boolean isValid = true;
        String result = "mixed";
        for (int i = 0; i < 8; ++i) {
            params[i] = sc.nextInt();
        }
        for (int i = 1; i < 9 && isValid; ++i) {
            if (params[i - 1] != i) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            result = "ascending";
        } else {
            isValid = true;
            for (int i = 1; i < 9 && isValid; ++i) {
                if (params[8 - i] != i) {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid && "mixed".equals(result)) {
            result = "descending";
        }
        System.out.print(result);
    }
}