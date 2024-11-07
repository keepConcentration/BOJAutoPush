import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int i = 0; i < 5; ++i) {
            int card = Integer.parseInt(br.readLine());
            result += card;
        }
        System.out.print(result);
    }
}