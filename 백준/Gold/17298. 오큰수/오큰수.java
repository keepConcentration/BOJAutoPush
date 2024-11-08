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
        
        int N = Integer.parseInt(br.readLine());
        String[] inStrArr = br.readLine().split(" ");
        int[] arr = new int[N];
        
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(inStrArr[i]);
        }
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; ++i) {
            int target = arr[i];
            
            while (!stack.isEmpty() && target > arr[stack.peek()]) {
                arr[stack.pop()] = target;
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}