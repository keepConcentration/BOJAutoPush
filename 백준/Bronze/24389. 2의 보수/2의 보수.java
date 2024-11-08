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
        
        int N = parseInt(br.readLine());
        int nComple = (~N) + 1;
        
        int resultBit = N ^ nComple;
        String resultStr = Integer.toBinaryString(resultBit);
        int result = 0;
        for (int i = 0;i < resultStr.length(); ++i) {
            char cha = resultStr.charAt(i);
            if (cha == '1') {
                result++;
            }
        }
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}