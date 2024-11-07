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
        
        String[] in1 = br.readLine().split(" ");
        String[] in2 = br.readLine().split(" ");
        
        int result = 0;
        int N = Integer.parseInt(in1[0]);
        int M = Integer.parseInt(in1[1]);
        LinkedList<Integer> deque = new LinkedList<Integer>();
        for (int i = 1; i <= N; ++i) {
            deque.add(i);
        }
        
        int mid = (1 + N) / 2;
        for (int i = 1; i <= M; ++i) {
            int target = Integer.parseInt(in2[i - 1]);
            int targetSeq = deque.indexOf(target) + 1;
            int midSeq = deque.size() / 2 + 1;
            if (midSeq < targetSeq) {
                int poll = -1;
                while (poll != target) {
                    poll = deque.pollLast();
                    deque.addFirst(poll);
                    result++;
                }
            } else {
                int poll = -1;
                while (poll != target) {
                    poll = deque.pollFirst();
                    if (poll == target) {
                        deque.addFirst(poll);
                        break;
                    }
                    deque.addLast(poll);
                    result++;
                }
            }
            deque.pollFirst();
        }
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}