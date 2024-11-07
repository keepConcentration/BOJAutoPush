import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String result = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        System.out.print(result.equals("") ? "0" : result.split(" ").length);
    }
}