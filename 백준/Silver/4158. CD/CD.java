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
        
        String in = "";
        
        while (!(in = br.readLine()).equals("0 0")) {
            String[] inArr = in.split(" ");
            int N = parseInt(inArr[0]);
            int M = parseInt(inArr[1]);
            
            int result = 0;
            int[] nArr = new int[N];
            int[] mArr = new int[M];
            
            for (int i = 0; i < N; ++i) {
                nArr[i] = parseInt(br.readLine());
            }
            
            for (int i = 0; i < M; ++i) {
                int target = parseInt(br.readLine());
                
                int left = 0;
                int right = N - 1;
                int mid = (left + right) / 2;
                
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (target < nArr[mid]) {
                        right = mid - 1;
                    } else if (target > nArr[mid]) {
                        left = mid + 1;
                    } else if (target == nArr[mid]) {
                        result++;
                        break;
                    }
                }
            }
            sb.append(result).append("\n");
        }
        
            
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}