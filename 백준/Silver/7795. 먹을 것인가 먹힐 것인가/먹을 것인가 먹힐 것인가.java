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
        
        int T = parseInt(br.readLine());
        
        while (T-- > 0) {
            String[] in = br.readLine().split(" ");
            int A = parseInt(in[0]);
            int B = parseInt(in[1]);
            
            String[] inArr = br.readLine().split(" ");
            int[] N = new int[A];
            
            for (int i = 0; i < A; ++i) {
                N[i] = parseInt(inArr[i]);
            }
            
            int result = 0;
            
            Arrays.sort(N);
            
            String[] M = br.readLine().split(" ");
            
            for (int i = 0; i < B; ++i) {
                int target = parseInt(M[i]);
                int left = 0;
                int right = A;
                
                while (left < right) {
                    int mid = (left + right) / 2;
                    
                    if (target < N[mid]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                
                result += A - left;
                
            }
            sb.append(result).append("\n");
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
