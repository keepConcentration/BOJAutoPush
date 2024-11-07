import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

interface Main {
    static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;
        BufferedWriter bw = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
            
        while (T-- > 0) {
            char[] functions = br.readLine().toCharArray();
            int size = Integer.parseInt(br.readLine());
            String arrStr = br.readLine();
            boolean isReverse = false;
            String[] arr = arrStr.substring(1, arrStr.length() - 1).split(",");
            Deque<String> deque = new LinkedList<>();
            
            for (int i = 0; i < arr.length; ++i) {
                if (!arr[i].equals("")) {
                    deque.add(arr[i]);
                }
            }
            try {
                for (int i = 0; i < functions.length; ++i) {
                    if (functions[i] == 'R') {
                        isReverse = !isReverse;
                        continue;
                    }
                    if (functions[i] == 'D') {
                        if (deque.isEmpty()) {
                            throw new Exception();
                        }
                        if (isReverse) {
                            deque.pollLast();
                        } else {
                            deque.pollFirst();
                        }
                    }
                }
            } catch (Exception e) {
                sb.append("error\n");
                continue;
            }
            sb.append("[");
            if (isReverse) {
                while (!deque.isEmpty()) {
                    sb.append(deque.pollLast());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
            } else {
                while (!deque.isEmpty()) {
                    sb.append(deque.pollFirst());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
            }
            sb.append("]\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}