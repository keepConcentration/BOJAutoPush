import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 1; i <= N; ++i) {
            String value = br.readLine();
            map.put(i, value);
            map2.put(value, i);
        }
        
        for (int i = 0; i < M; ++i) {
            String target = br.readLine();
            try {
                int targetKey = Integer.parseInt(target);
                sb.append(map.get(targetKey)).append("\n");
            } catch (NumberFormatException e) {
                sb.append(map2.get(target)).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}