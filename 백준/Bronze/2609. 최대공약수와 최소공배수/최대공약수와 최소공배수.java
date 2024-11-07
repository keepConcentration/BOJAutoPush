import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String[] params = param.split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        int result1 = a;
        int result2 = 0;
        int b1 = b;
        while (b1 != 0) {
            int remainder = result1 % b1;
            result1 = b1;
            b1 = remainder;
        }
        
        result2 = a * b / result1;

        System.out.println(result1 + "\n" + result2);
    }
}