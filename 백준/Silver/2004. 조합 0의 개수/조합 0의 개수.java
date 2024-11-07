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
        
        int result5 = get5Count(N) - get5Count(K) - get5Count(N - K);
        int result2 = get2Count(N) - get2Count(K) - get2Count(N - K);
        
        
        
        sb.append(Math.min(result2, result5)).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static int get5Count(int $a) {
        int cnt = 0;
        int a = $a;
        while (a >= 5) {
            cnt += a / 5;
            a /= 5;
        }
        return cnt;
    }
    
    public static int get2Count(int $a) {
        int cnt = 0;
        int a = $a;
        while (a >= 2) {
            cnt += a / 2;
            a /= 2;
        }
        return cnt;
    }
}