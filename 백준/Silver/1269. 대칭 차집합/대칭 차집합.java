import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String[] in = br.readLine().split(" ");
        int aCnt = Integer.parseInt(in[0]);
        int bCnt = Integer.parseInt(in[1]);
        int result = 0;
        
        Set<Integer> set = new HashSet<>();
        String[] inA = br.readLine().split(" ");
        String[] inB = br.readLine().split(" ");
        for (int i = 0; i < aCnt; ++i) {
            set.add(Integer.parseInt(inA[i]));
        }
        
        for (int i = 0; i < bCnt; ++i) {
            int b = Integer.parseInt(inB[i]);
            if (set.contains(b)) {
                set.remove(b);
            } else {
                result++;
            }
        }
        result += set.size();
        sb.append(result).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}