 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Long.parseLong;

interface Main {
    
    public static final long P = 1_000_000_007;
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        
        long N = parseLong(in[0]);
        long K = parseLong(in[1]);
        
        long fN = factorial(N);
        long fK = factorial(K) * factorial(N - K) % P;
        
        long result = fN * pow(fK, P - 2) % P;
        
        
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static long factorial(long N) {
        long result = 1L;
        while (N > 0) {
            result = result * N % P;
            N--;
        }
        return result;
    }
    
    public static long pow(long num, long pow) {
        if (pow == 1) {
            return num % P;
        }
        long temp = pow(num, pow / 2);
        
        if (pow % 2 == 1) {
            return (temp * temp % P) * num % P;
        }
        return temp * temp % P;
    }
}