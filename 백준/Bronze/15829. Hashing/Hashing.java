import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int T = Integer.parseInt(br.readLine());
        
        char[] arr = br.readLine().toCharArray();
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < T; ++i) {
            BigInteger cha = BigInteger.valueOf(arr[i] - 96);
            BigInteger bi = BigInteger.valueOf(31).pow(i).multiply(cha);
            result = result.add(bi);
        }
        result = result.mod(BigInteger.valueOf(1234567891));
        sb.append(result.toString());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}