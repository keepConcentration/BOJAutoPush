import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int loop = Integer.parseInt(br.readLine());
        int[] paramArr = new int[loop];
        String param[] = br.readLine().split(" ");
        
        for (int i = 0; i < loop; ++i) {
            paramArr[i] = Integer.parseInt(param[i]);
        }
        br.close();
        
        int[] sortArr = paramArr.clone();
        Arrays.sort(sortArr);
        
        int cnt = 0;
        for (int i = 0; i < loop; ++i) {
            int a = sortArr[i];
            if (!map.containsKey(a)) {
                map.put(a, cnt++);
            }
        }
        
        for (int i = 0; i < loop; ++i) {
            sb.append(map.get(paramArr[i]));
            sb.append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}