import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> subStack = new Stack<>();
        String[] S = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            subStack.push(Integer.parseInt(S[i]));
        }
        for (int i = 0; i < N; ++i) {
            stack.push(subStack.pop());
        }

        boolean success = true;
        for (int i = 1; i <= N; ++i) {
            boolean isPop = false;
            if (stack.contains(i)) {
                while (!stack.isEmpty()) {
                    int pop = stack.pop();
                    if (pop == i) {
                        isPop = true;
                        break;
                    } else {
                        subStack.push(pop);
                    }
                }
            }
            if (isPop) {
                continue;
            }
            if (subStack.contains(i)) {
                int pop = subStack.pop();
                success = pop == i;
            }
            if (success) {
                continue;
            } else {
                success = false;
                break;
            }
        }
        if (success) {
            sb.append("Nice");
        } else {
            sb.append("Sad");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
