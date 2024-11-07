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
        String S = br.readLine();
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < S.length(); ++i) {
            for (int j = i + 1; j <= S.length(); ++j) {
                String part = S.substring(i, j);
                if (!set.contains(part)) {
                    set.add(part);
                }
            }
        }
        sb.append(set.size()).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}