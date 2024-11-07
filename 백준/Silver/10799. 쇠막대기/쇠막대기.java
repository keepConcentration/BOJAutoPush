import java.io.*;
import java.util.Stack;

class Main {
    static Integer[] dp = new Integer[16];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        int totalCount = 0;
        for (int i = 0; i < str.length(); ++i) {
            char cha = str.charAt(i);
            if (cha == '(') {
                stack.push(cha);
            } else if (cha == ')') {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    totalCount += stack.size();
                } else {
                    totalCount++;
                }
            }
        }

        sb.append(totalCount);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}