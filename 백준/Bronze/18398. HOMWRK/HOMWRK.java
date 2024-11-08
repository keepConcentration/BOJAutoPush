import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; ++i) {
            int cnt = Integer.parseInt(br.readLine());
            for (int j = 0; j < cnt; ++j) {
                String param = br.readLine();
                String[] arr = param.split(" ");
                BigInteger target1 = new BigInteger(arr[0]);
                BigInteger target2 = new BigInteger(arr[1]);
                BigInteger result1 = target1.add(target2);
                BigInteger result2 = target1.multiply(target2);
                
                sb.append(result1.toString());
                sb.append(" ");
                sb.append(result2.toString());
                sb.append("\n");
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}