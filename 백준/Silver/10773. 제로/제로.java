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
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; ++i) {
            int in = Integer.parseInt(br.readLine());
            if (in == 0) {
                int pop = stack.pop();
                result -= pop;
            } else {
                stack.add(in);
                result += in;
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
