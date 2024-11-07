import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int result = 0;
        for (int i = 0; i < loop; ++i) {
            String param = sc.next();
            boolean[] isChecked = new boolean[26];
            char prevKeyCode= ' ';
            for (int j = 0; j < param.length(); ++j) {
                char target = param.charAt(j);
                int idx = (int)target - 97;
                if (!isChecked[idx]) {
                    isChecked[idx] = true;
                    prevKeyCode = target;
                } else if (prevKeyCode != target) break;
                if (j == param.length() - 1) ++result;
            }
        }
        System.out.print(result);
    }
}