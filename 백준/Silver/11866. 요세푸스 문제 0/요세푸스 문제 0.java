import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int K = Integer.parseInt(in[0]);
        int N = Integer.parseInt(in[1]);
        
        sb.append("<");
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= K; ++i) {
            q.add(i);
        }
        int count = 0;
        while (!q.isEmpty()) {
            count++;
            int poll = q.poll();
            if (count == N) {
                count = 0;
                sb.append(poll).append(", ");
            } else {
                q.add(poll);
            }
        }
        
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}