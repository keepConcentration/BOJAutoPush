import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loop = new Scanner(System.in).nextInt();
        String result = "";
        for (int i = loop; i > 0; --i) {
            result = "";
            for (int j = 1; j <= loop; ++j) {
                result += j < i ? " " : "*";
            }
            System.out.println(result);
        }
    }
}