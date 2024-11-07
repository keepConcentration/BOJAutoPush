import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; ++i) {
            LinkedList<int[]> q = new LinkedList<>();
            int result = 0;
            
            String[] in = br.readLine().split(" ");
            int totDoc = Integer.parseInt(in[0]);
            int docIdx = Integer.parseInt(in[1]);
            
            String[] docList = br.readLine().split(" ");
            
            for (int j = 0; j < totDoc; ++j) {
                int[] arr = new int[] {j, Integer.parseInt(docList[j])};
                q.add(arr);
            }
            
            l:while (!q.isEmpty()) {
                int[] poll = q.poll();
                
                for (int j = 0; j < q.size(); ++j) {
                    if (poll[1] < q.get(j)[1]) {
                        q.add(poll);
                        continue l;
                    }
                }
                result++;
                
                if (poll[0] == docIdx) {
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}