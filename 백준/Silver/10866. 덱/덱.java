import java.util.Deque;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        Deque<Integer> dq = new LinkedList<>();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; ++i) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push_front" :
                    dq.addFirst(Integer.parseInt(input[1]));
                    break;
                case "push_back" :
                    dq.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop_front" :
                    Integer pollFirst = dq.pollFirst();
                    if (pollFirst == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(pollFirst).append("\n");
                    }
                    break;
                case "pop_back" :
                    Integer pollLast = dq.pollLast();
                    if (pollLast == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(pollLast).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty" :
                    if (dq.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front" :
                    Integer peekFirst = dq.peekFirst();
                    if (peekFirst == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(peekFirst).append("\n");
                    }
                    break;
                case "back" :
                    Integer peekLast = dq.peekLast();
                    if (peekLast == null) {
                        sb.append("-1\n");
                    } else {
                        sb.append(peekLast).append("\n");
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}