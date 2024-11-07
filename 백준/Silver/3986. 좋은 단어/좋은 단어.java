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
        int resultCnt = 0;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; ++i) {
            in = br.readLine();
            char[] arr = in.toCharArray();
            boolean result = true;
            Stack<Character> stack = new Stack<>();
            for (char cha : arr) {
                if (stack.isEmpty()) {
                    stack.add(cha);
                    continue;
                }
                if (stack.peek() == cha) {
                    stack.pop();
                } else {
                    stack.add(cha);
                }
            }
            if (!stack.isEmpty()) {
                result = false;
            }
            
            if (result) {
                resultCnt++;
            }
        }
        
        sb.append(resultCnt).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}