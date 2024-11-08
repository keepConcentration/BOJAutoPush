import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Map;
import java.util.HashMap;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in= br.readLine().split(" ");
        int N = parseInt(in[0]);
        int M = parseInt(in[1]);
        
        int[] keySet = new int[N];
        Map<Integer, String> map = new HashMap<>();
        
        for (int i = 0; i < N; ++i) {
            String[] in2 = br.readLine().split(" ");
            int key = parseInt(in2[1]);
            if (!map.containsKey(key)) {
                map.put(key, in2[0]);
                keySet[i] = key;
            } else {
                i--;
                N--;
            }
        }
        
        for (int i = 0; i < M; ++i) {
            int target = parseInt(br.readLine());
            int left = 0;
            int right = N;
            int mid = 0;
            while (left < right) {
                mid = (left + right) / 2;
                
                if (target <= keySet[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            sb.append(map.get(keySet[left])).append("\n");
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}