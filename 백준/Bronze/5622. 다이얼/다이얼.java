import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String param = new Scanner(System.in).next();
        String[] list = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int result = 0;
        for (int i = 0; i < param.length(); ++i) {
            String target = param.substring(i, i + 1);
            for (int j = 0; j < list.length; ++j) {
                if (list[j].indexOf(target) != -1) {
                    result += j + 3;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}