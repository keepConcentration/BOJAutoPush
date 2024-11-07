import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt(),
            max = 0,
            idx = 0;
        double tot = 0;
        int[] params = new int[loop];
        for (int i = 0; i < loop; ++i) {
            params[i] = sc.nextInt();
        }
        for (int i = 0; i < loop; ++i) {
            int param = params[i];
            if (max < param) {
                max = param;
                idx = i;
            }
        }
        for (int i = 0; i < loop; ++i) {
            tot += (double)params[i] / (double)max * 100;
        }
        System.out.print(tot / loop);
    }
}