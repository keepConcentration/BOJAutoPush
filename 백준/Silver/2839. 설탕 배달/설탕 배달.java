import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int param = new Scanner(System.in).nextInt(),
            result = 0;
        while (param % 5 != 0 && param > 2 && param != 4 && param != 7) {
            param -= 3;
            ++result;
        }
        System.out.print(param != 4 && param != 7 ? result + param / 5 : -1);
    }
}