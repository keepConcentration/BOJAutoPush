import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            br.readLine();
            int cnt = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < cnt; ++j) {
                sum = sum.add(new BigInteger(br.readLine()));
            }
            if (sum.compareTo(BigInteger.ZERO) == 0) {
                result += "YES\n";
            } else {
                BigInteger remainder = sum.remainder(new BigInteger("" + cnt));
                if (remainder.compareTo(BigInteger.ZERO) == 0) {
                    result += "YES";
                } else {
                    result += "NO";
                }
                result += "\n";
            }
        }
        System.out.print(result);
    }
}