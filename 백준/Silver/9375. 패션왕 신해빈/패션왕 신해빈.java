 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int N = parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; ++i) {
                
                String[] arr = br.readLine().split(" ");
                if (map.containsKey(arr[1])) {
                    map.put(arr[1], map.get(arr[1]) + 1);
                } else {
                    map.put(arr[1], 1);
                }
            }
            int result = 1;
            for (int i : map.values()) {
                result *= (i + 1);
            }
            result--;
            sb.append(result).append("\n");
        }
        
        
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}