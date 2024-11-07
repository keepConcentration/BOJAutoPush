import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String[] in = br.readLine().split(" ");
        
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);        
        int result = factorial(N) / (factorial(N - K) * factorial(K));
        sb.append(result).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
                                               
     static int factorial(int N) {
         if (N <= 1) {
             return 1;
         }
         return N * factorial(N - 1);
     }
                                               
}