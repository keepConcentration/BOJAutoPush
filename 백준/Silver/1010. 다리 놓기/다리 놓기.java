import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    
    static int[][] memo = new int[31][31];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            int west = Integer.parseInt(param[0]);
            int east = Integer.parseInt(param[1]);
            
            int result = C(east, west);
            
            sb.append(String.valueOf(result));
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
    
    static int C(int n, int r) {
        if (memo[n][r] > 0) {
            return memo[n][r];
        }
        if (r == 0 || n == r) {
            memo[n][r] = 1;
            return memo[n][r];
        }
        memo[n][r] = C(n - 1, r - 1) + C(n - 1, r);
        return memo[n][r];
    }
}