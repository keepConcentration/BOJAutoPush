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
        String[] in1 = br.readLine().split(" ");
        Map<String, String> map = new HashMap<>();
        
        int N = Integer.parseInt(in1[0]);
        int M = Integer.parseInt(in1[1]);
        
        
        for (int i = 0; i < N; ++i) {
            String[] in2 = br.readLine().split(" ");
            map.put(in2[0], in2[1]);
        }
        
        for (int i = 0;i < M; ++i) {
            sb.append(map.get(br.readLine())).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}