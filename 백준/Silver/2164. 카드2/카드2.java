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
        
        Queue<Integer> q = new LinkedList<>();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 1; i <= cnt; ++i) {
            q.add(i);
        }
        int result = 1;
        while (q.size() > 1) {
            q.remove();
            if (q.size() == 1) {
                result = q.poll();
                break;
            }
            int poll = q.poll();
            q.add(poll);
        }
        sb.append(result).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}