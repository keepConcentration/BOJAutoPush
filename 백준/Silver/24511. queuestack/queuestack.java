import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; ++i) {
            String a = A[i];
            if ("0".equals(a)) {
                queue.add(Integer.parseInt(B[i]));
            }
        }

        int M = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        for (int i = 0; i < M; ++i) {
            int c = Integer.parseInt(C[i]);
            queue.addFirst(c);
            c = queue.pollLast();
            sb.append(c).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}