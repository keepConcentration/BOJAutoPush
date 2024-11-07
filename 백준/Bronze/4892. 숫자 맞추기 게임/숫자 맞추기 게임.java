import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for (int i = 1; ; ++i) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                break;
            }
            result += i + ". ";
            int n4 = 0;
            if (a % 2 != 0) {
                result += "odd ";
                n4 = (((3 * a) + 1) / 2) * 3 / 9;
            } else {
                result += "even ";
                n4 = ((3 * a) / 2) * 3 / 9;
            }
            result += n4 + "\n";
        }
        System.out.print(result);
    }
}