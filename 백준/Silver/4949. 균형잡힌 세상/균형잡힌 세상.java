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
        String in = "";
        
        while (!(in = br.readLine()).equals(".")) {
            char[] arr = in.toCharArray();
            boolean result = true;
            Stack<Character> stack = new Stack<>();
            for (char cha : arr) {
                if (cha == '(' || cha == '[') {
                    stack.add(cha);
                }
                if (cha == ')') {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    char pop = stack.pop();
                    if (pop != '(') {
                        result = false;
                        break;
                    }
                }
                if (cha == ']') {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    char pop = stack.pop();
                    if (pop != '[') {
                        result = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                result = false;
            }
            if (result) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}