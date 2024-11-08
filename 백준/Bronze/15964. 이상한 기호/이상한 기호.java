import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] params = br.readLine().split(" ");
        BigInteger a = new BigInteger(params[0]);
        BigInteger b = new BigInteger(params[1]);
        BigInteger result = (a.add(b)).multiply((a.subtract(b)));
        bw.write(result.toString() + "\n");
        bw.flush();
        
    }
}