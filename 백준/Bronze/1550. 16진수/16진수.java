import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String param = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(Integer.parseInt(param, 16));
    }
}