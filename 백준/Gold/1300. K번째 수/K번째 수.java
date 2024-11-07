import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = parseInt(br.readLine());
        int k = parseInt(br.readLine());
        
        int left = 1;
        int right = k;
        
        while (left < right) {
            long count = 0L;
            int mid = (left + right) / 2;
            for (int i = 1; i <= N; ++i) {
                if (mid / i > N) {
                    count += N;
                } else {
                    count += mid / i;
                }
            }
            
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        sb.append(left).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}