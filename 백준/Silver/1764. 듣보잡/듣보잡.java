import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int resultCnt = 0;
        List<String> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            map.put(br.readLine(), i);
        }
        
        for (int i = 0; i < M; ++i) {
            String target = br.readLine();
            if (map.containsKey(target)) {
                list.add(target);
            }
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String str : list) {
            sb.append(str).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}