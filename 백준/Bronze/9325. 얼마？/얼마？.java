import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            BigInteger car = new BigInteger(br.readLine());
            int loop2 = Integer.parseInt(br.readLine());
            BigInteger compute = BigInteger.ZERO;
            for (int j = 0; j < loop2; ++j) {
                String[] param = br.readLine().split(" ");
                BigInteger cnt = new BigInteger(param[0]);
                BigInteger price = new BigInteger(param[1]);
                compute = compute.add(cnt.multiply(price));
            }
            compute = compute.add(car);
            result += compute.toString();
            result += "\n";
        }
        System.out.print(result);
    }
}