import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        BigInteger a = new BigInteger(params[0]);
        BigInteger b = new BigInteger(params[1]);
        
        System.out.println(a.multiply(b));
    }
}