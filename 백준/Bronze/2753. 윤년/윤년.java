import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int param = new Scanner(System.in).nextInt();
        if (param % 4 == 0 && param % 100 != 0 || param % 400 == 0) {
            System.out.print("1");
        } else System.out.print("0");
    }
}