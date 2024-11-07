import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; ++i) {
            map.put(br.readLine(), i);
        }
        for (int i = 0; i < M; ++i) {
            String target = br.readLine();
            if (map.containsKey(target)) {
                result++;
            }
        }
        
        sb.append(result).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}