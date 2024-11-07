 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String[] arr = br.readLine().split(" ");
        int N = parseInt(arr[0]);
        int K = parseInt(arr[1]);
        
        int[][] dp = new int[N + 1][N + 1];
        
        for (int i = 0; i < N + 1; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }
        
        sb.append(dp[N][K]).append("\n");
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}