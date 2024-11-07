import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        long a = Integer.parseInt(params[0]);
        long b = Integer.parseInt(params[1]);
        
        long length = Math.max(a, b) - Math.min(a, b);
        
        System.out.println((a + b) * (length + 1) / 2);
        
    }
}