import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String[] params = param.split(" ");
        long a = Long.parseLong(params[0]);
        long b = Long.parseLong(params[1]);
        
        long tempA = a;
        long tempB = b;
        long r = 0;
        while (tempB != 0) {
            r = tempA % tempB;
            tempA = tempB;
            tempB = r;
        }
        System.out.println(a / tempA * b);
    }
}