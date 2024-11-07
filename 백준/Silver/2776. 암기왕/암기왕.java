import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] in1 = br.readLine().split(" ");
            int M = Integer.parseInt(br.readLine());
            String[] in2 = br.readLine().split(" ");
            
            int[] arr = new int[N + 1];
            
            
            for (int i = 0; i < N; ++i) {
                arr[i] = Integer.parseInt(in1[i]);
                
            }
            Arrays.sort(arr);
            l:for (int i = 0; i < M; ++i) {
                int target = Integer.parseInt(in2[i]);
                int loopMin = 0;
                int loopMax = N;
                while (loopMin <= loopMax) {
                    int mid = (loopMin + loopMax) / 2;
                    if (target == arr[mid]) {
                        sb.append("1\n");
                        continue l;
                    }
                    if (target > arr[mid]) {
                        loopMin = mid + 1;
                    } else {
                        loopMax = mid - 1;
                    }
                }
                sb.append("0\n");
            }
            
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}