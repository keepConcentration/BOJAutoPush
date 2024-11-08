import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextLine();
        }

        String lieName = "";
        l:for (int i = 0; i < N; ++i) {
            String question = "? " + arr[i];
            boolean isBirthday1 = false;
            boolean isBirthday2;
            for (int j = 0; j < 2; ++j) {
                System.out.println(question);
                System.out.flush();
                String answer = sc.nextLine();
                if (j == 0) {
                    isBirthday1 = "1".equals(answer);
                }
                if (j == 1) {
                    isBirthday2 = "1".equals(answer);

                    if (isBirthday1 && isBirthday2) {
                        System.out.println("! " + arr[i]);
                        System.out.flush();
                        lieName = null;
                        break l;
                    }
                    if (isBirthday1 != isBirthday2) {
                        lieName = arr[i];
                    }
                }
            }
        }
        if (lieName != null) {
            System.out.println("! " + lieName);
            System.out.flush();
        }
    }
}