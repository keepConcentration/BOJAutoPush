import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Arrays;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int N = parseInt(in[0]);
        int M = parseInt(in[1]);
        
        String[] in2 = br.readLine().split(" ");
        int[] L = new int[M];
        
        int left = 1;
        int right = 0;
        
        for (int i = 0; i < M; ++i) {
            L[i] = parseInt(in2[i]);
            
        }
        Arrays.sort(L);
        right = L[M - 1];
        
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            
            for (int i = 0; i < M; ++i) {
                cnt += L[i] / mid;
            }
            
            if (N > cnt) {
                right = mid - 1;
            } else {
                if (result < mid) {
                    result = mid;
                }
                left = mid + 1;
            }
        }
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}