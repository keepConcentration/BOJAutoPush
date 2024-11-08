import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        while (N-- > 0) {
            String[] in = br.readLine().split(" ");
            int order = Integer.parseInt(in[0]);
            if (order == 1) {
                deque.addFirst(Integer.parseInt(in[1]));
            } else if (order == 2) {
                deque.addLast(Integer.parseInt(in[1]));
            } else if (order == 3) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            } else if (order == 4) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            } else if (order == 5) {
                sb.append(deque.size()).append("\n");
            } else if (order == 6) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (order == 7) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            } else {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
