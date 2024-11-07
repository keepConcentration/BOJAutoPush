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
        
        int ACnt = parseInt(br.readLine());
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] arr = br.readLine().split(" ");
        
        for (int i = 0; i < ACnt; ++i) {
            int A = parseInt(arr[i]);
            if (A < min) {
                min = A;
            }
            if (A > max) {
                max = A;
            }
        }
        sb.append(min * max).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}