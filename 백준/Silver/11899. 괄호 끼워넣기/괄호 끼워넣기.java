import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String in = br.readLine();
        int result = 0;
        char[] arr = in.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char cha : arr) {
            if (cha == '(') {
                stack.add(cha);
            }
            if (cha == ')') {
                if (stack.isEmpty()) {
                    result++;
                } else {
                    stack.pop();
                }
            }
        }
        result += stack.size();
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}