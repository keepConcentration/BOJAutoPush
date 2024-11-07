import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 1; i <= loop; ++i) {
            result += "Scenario #" + i + ":\n";
            String[] param = br.readLine().split(" ");
            int a = (int)Math.pow(Integer.parseInt(param[0]), 2);
            int b = (int)Math.pow(Integer.parseInt(param[1]), 2);
            int c = (int)Math.pow(Integer.parseInt(param[2]), 2);
            int temp = 0;
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b < c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (a == b + c) {
                result += "yes\n\n";
            } else {
                result += "no\n\n";
            }
        }
        System.out.print(result);
    }
}