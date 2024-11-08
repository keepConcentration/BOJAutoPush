import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import static java.lang.Integer.parseInt;
import java.util.Map;
import java.util.HashMap;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in1 = br.readLine().split(" ");
        int N = parseInt(in1[0]);
        int M = parseInt(in1[1]);
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            }
        }
        
        for (int i = 0; i < M; ++i) {
            int target = parseInt(br.readLine());
            if (map.containsKey(target)) {
                sb.append(map.get(target)).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}