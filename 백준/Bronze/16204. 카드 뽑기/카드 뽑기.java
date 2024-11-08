import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        int N = Integer.parseInt(params[0]);
        int M = Integer.parseInt(params[1]);	// O
        int X = N - M;							// X
        int K = Integer.parseInt(params[2]);	// O
        int L = N - K;							// X
        
        int result1 = Math.min(M, K);
        int result2 = Math.min(X, L);
        
        System.out.println(result1 + result2);
        
    }
}