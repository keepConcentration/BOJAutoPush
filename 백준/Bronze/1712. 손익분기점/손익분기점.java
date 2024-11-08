import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt(),
            result = -1;
        
        for (int i = 1; i <= Integer.MAX_VALUE && i > 0; ++i) {
            if (i * (c - b) > a) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}
