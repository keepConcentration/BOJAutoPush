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
            String[] param = br.readLine().split(" ");
            BigInteger a = new BigInteger(param[0]);
            BigInteger b = new BigInteger(param[1]);
            BigInteger c = a.add(b);
            sb.append(c.intValue());
            sb.append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}