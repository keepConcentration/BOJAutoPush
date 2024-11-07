import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(",");
        int result = 0;
        for (int i = 0; i < params.length; ++i) {
            result += Integer.parseInt(params[i]);
        }
        System.out.println(result);
    }
}