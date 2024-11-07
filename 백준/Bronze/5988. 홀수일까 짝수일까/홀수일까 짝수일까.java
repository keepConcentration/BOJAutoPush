import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            BigInteger a = new BigInteger(br.readLine());
            result += (a.remainder(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) ? "even\n" : "odd\n";
        }
        System.out.print(result);
    }
}