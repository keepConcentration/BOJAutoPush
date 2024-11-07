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
        
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int start = 0;
        
        while (N-- > 0) {
            int in = Integer.parseInt(br.readLine());
            if (in > start) {
                for (int i = start + 1; i <= in; ++i) {
                    sb.append("+\n");
                    stack.push(i);
                }
                
                start = in;
            } else if (stack.peek() != in) {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
            stack.pop();
            sb.append("-\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}