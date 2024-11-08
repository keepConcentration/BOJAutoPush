import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        BigInteger a = new BigInteger(br.readLine());
        System.out.println(a.multiply(new BigInteger(br.readLine())));
    }
}