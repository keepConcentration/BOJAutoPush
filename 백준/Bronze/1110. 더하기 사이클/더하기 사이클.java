import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int param = new Scanner(System.in).nextInt(),
            target = param / 10 == 0 ? param * 11 : (param % 10) * 10 + (param / 10 + (param % 10)) % 10,
            result = 1;
        while (param != target) {
            target = target / 10 == 0 ? target * 11 : (target % 10) * 10 + (target / 10 + (target % 10)) % 10;
            ++result;
        }
        System.out.print(result);
    }
}