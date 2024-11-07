import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
    public static void main (String[] args) throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        StringBuffer result = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int readCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < readCnt; ++i) {
            String read = br.readLine();
            if (read.indexOf("push") != -1) {
                stack.push(Integer.parseInt(read.substring(5, read.length())));
            } else {
                if ("pop".equals(read)) {
                try {
                    result.append(stack.pop());
                } catch (Exception e) {
                    result.append("-1");
                }
            } else if ("size".equals(read)) {
                result.append(stack.size());
            } else if ("empty".equals(read)) {
                result.append(stack.empty() ? 1 : 0);
            } else {
                try {
                    result.append(stack.lastElement());
                } catch (Exception e) {
                    result.append("-1");
                }
            }
            
            if (i != readCnt - 1) {
                result.append("\n");
            }
            }
        }
        System.out.println(result.toString());
    }
}