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
        
        String[] in1 = br.readLine().split(" ");
        final int N = parseInt(in1[0]);
        final int M = parseInt(in1[1]);
        final int B = parseInt(in1[2]);
        
        int[] map = new int[N * M];
        
        int i = 0;
        for (; i < N * M;) {
            String[] in2 = br.readLine().split(" ");
            for (int j = 0; j < M; ++j) {
                map[i] = parseInt(in2[j]);
                i++;
            }
        }
        
        Arrays.sort(map);
        
        int resultTime = Integer.MAX_VALUE;
        int resultHeight = Integer.MIN_VALUE;
        int beforeComputeHeight = -1;
        i = 0;
        l:for (int k = map[0]; k <= map[N * M - 1]; ++k) {
            if (beforeComputeHeight == k) {
                continue;
            }
            beforeComputeHeight = k;
            int tempTime = 0;
            int targetHeight = k;
            int tempB = B;
            
            for (int j = N * M - 1; j > i; --j) {
                int curHeight = map[j];
                if (curHeight == targetHeight) {
                    break;
                }
                
                if (curHeight > targetHeight) {
                    int minus = curHeight - targetHeight;
                    tempTime += (minus * 2);
                    tempB += minus;
                }
            }
            
            for (int j = 0; j < N * M; ++j) {
                int curHeight = map[j];
                if (curHeight == targetHeight) {
                    break;
                }
                
                if (curHeight < targetHeight) {
                    int plus = targetHeight - curHeight;
                    
                    if (tempB < plus) {
                        i++;
                        continue l;
                    }
                    tempTime += plus;
                    tempB -= plus;
                }
            }
            if (resultTime == tempTime) {
                if (resultHeight < targetHeight) {
                    resultTime = tempTime;
                    resultHeight = targetHeight;
                }
            } else if (resultTime > tempTime) {
                resultTime = tempTime;
                resultHeight = targetHeight;
            }
            i++;
        }
        sb.append(resultTime).append(' ').append(resultHeight).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}