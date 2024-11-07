import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}