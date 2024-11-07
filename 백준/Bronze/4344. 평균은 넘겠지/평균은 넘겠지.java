import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String result = "";
        for (int i = 0; i < loop; ++i) {
            double avg = 0;
            int tot = 0;
            int[] loop2 = new int[sc.nextInt()];
            for (int j = 0; j < loop2.length; ++j) {
                loop2[j] = sc.nextInt();
                tot += loop2[j];
            }
            avg = (double)tot / (double)loop2.length;
            tot = 0;
            for (int param : loop2) {
                if ((double)param > avg) {
                    ++tot;
                }
            }
            avg = (double)tot / (double)loop2.length;
            result += String.format("%.3f", avg * 100) + "%\n";
        }
        System.out.print(result);
    }
}