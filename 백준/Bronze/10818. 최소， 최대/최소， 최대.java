import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt(),
            max = Integer.MIN_VALUE,
            min = Integer.MAX_VALUE;
        for (int i = 0; i < loop; ++i) {
            int input = sc.nextInt();
            max = input > max ? input : max;
            min = input < min ? input : min;
        }
        System.out.print(min + " " + max);
    }
}