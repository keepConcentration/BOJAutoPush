import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String param = br.readLine();
        String[] params = param.split(" ");
        
        long a = Long.parseLong(params[0]);
        long b = Long.parseLong(params[1]);
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        for (long i = 0; i < a; ++i) {
            sb.append("1");
        }
        
        System.out.println(sb.toString());
        
    }
}