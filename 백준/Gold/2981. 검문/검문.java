import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(br.readLine());
        }
        
        int gcd = Math.abs(arr[1] - arr[0]);
        
        for (int i = 2; i < N; ++i) {
            gcd = gcd(gcd, Math.abs(arr[i] - arr[i - 1]));
        }
        
        for (int i = 2; i <= gcd; ++i) {
            if (gcd % i == 0) {
                sb.append(i).append(" ");
            }
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static int gcd(int a, int b) {
        
        while (b != 0) {
            int mod = a % b;
            a = b;
            b = mod;
        }
        return a;
    }
}