import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in1 = br.readLine().split(" ");
        int N = parseInt(in1[0]);
        int T = parseInt(in1[1]);
        
        long result = (long)(Integer.MAX_VALUE) + 1;
        
        l:while (N-- > 0) {
            String[] in2 = br.readLine().split(" ");
            int S = parseInt(in2[0]);
            int I = parseInt(in2[1]);
            int C = parseInt(in2[2]);
            int tmpResult = S;
            for (int i = 0; i < C; ++i) {
                tmpResult = I * i + S;
                
                if (tmpResult < 0) {
                    continue l;
                }
                if (tmpResult >= T && result > (tmpResult - T) && tmpResult >= 0) {
                    result = tmpResult - T;
                    break;
                }
            }
        }
        if (result == (long)(Integer.MAX_VALUE) + 1) {
            result = -1;
        }
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}