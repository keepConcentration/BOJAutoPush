import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws Exception {
        String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        BigInteger a = new BigInteger(param[0]);
        BigInteger b = new BigInteger(param[1]);
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}