import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int param = Integer.parseInt(br.readLine());
        double sqrt = Math.sqrt(param);
        for (int i = 2; i <= sqrt; ++i) {
            while (param % i == 0) {
                System.out.println(i);
                param /= i;
            }
            if (param == 1) {
                break;
            }
        }
        if (param != 1) {
            System.out.println(param);
        }
    }
}