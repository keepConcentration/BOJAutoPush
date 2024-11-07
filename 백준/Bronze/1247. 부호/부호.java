import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; ++i) {
            int loop = Integer.parseInt(br.readLine());
            BigInteger bi = BigInteger.ZERO;
            for (int j = 0; j < loop; ++j) {
                bi = bi.add(new BigInteger(br.readLine()));
            }
            if (bi.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            } else if (bi.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("0");
            } else {
                System.out.println("+");
            }
        }
    }
}