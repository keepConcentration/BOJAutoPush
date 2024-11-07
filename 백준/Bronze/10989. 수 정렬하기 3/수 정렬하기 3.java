import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        
        int[] cntArr = new int[10001];
        
        for (int i = 0; i < cnt; ++i) {
            int parm  = Integer.parseInt(br.readLine());
            cntArr[parm]++;
        }
        br.close();
        
        for (int i = 1; i < 10001; ++i) {
            while (cntArr[i] > 0) {
                sb.append(i);
                sb.append("\n");
                cntArr[i]--;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}