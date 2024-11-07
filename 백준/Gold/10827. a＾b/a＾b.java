import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(param[0]);
        int b = Integer.parseInt(param[1]);
        
        BigDecimal result = a.pow(b);
        System.out.println(result.toPlainString());
    }
}