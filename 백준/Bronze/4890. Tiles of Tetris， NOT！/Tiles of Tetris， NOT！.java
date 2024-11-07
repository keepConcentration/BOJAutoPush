import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = "";
        String result = "";
        while (!(readLine = br.readLine()).equals("0 0")) {
            String[] params = readLine.split(" ");
            BigInteger a = new BigInteger(params[0]);
            BigInteger b = new BigInteger(params[1]);
            BigInteger tempA = a;
            BigInteger tempB = b;
            BigInteger r = BigInteger.ZERO;
            if (a.compareTo(b) == 0) {
                result += "1\n";
            } else {
                while (tempB.compareTo(BigInteger.ZERO) != 0) {
                    r = tempA.remainder(tempB);
                    tempA = tempB;
                    tempB = r;
                }
                result += (a.multiply(b).divide(tempA.multiply(tempA)).toString()) + "\n";
            }
        }
        System.out.print(result);
    }
}