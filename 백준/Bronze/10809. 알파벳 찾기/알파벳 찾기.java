import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        for (char i = 97; i <= 122; ++i) {
            if (i != 122) {
                System.out.print(input.indexOf(i) + " ");
            } else {
                System.out.print(input.indexOf(i));
            }
        }
    }
}