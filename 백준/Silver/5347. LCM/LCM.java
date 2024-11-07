import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            String[] params = br.readLine().split(" ");
            BigInteger a = new BigInteger(params[0]);
            BigInteger b = new BigInteger(params[1]);
            if (a.compareTo(b) == -1) {
                BigInteger temp = a;
                a = b;
                b = temp;
            }
            BigInteger tempA = a;
            BigInteger tempB = b;
            BigInteger r = BigInteger.ZERO;
            
            while (tempB.compareTo(BigInteger.ZERO) != 0) {
                r = tempA.remainder(tempB);
                tempA = tempB;
                tempB = r;
            }
            result += a.multiply(b).divide(tempA).toString()  + "\n";
        }
        System.out.print(result);
    }
}