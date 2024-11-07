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
        
        int N = parseInt(br.readLine());
        
        String[] strArr = br.readLine().split(" ");
        
        int ring = parseInt(strArr[0]);
        
        for (int i = 1; i < N; ++i) {
            int ring2 = parseInt(strArr[i]);
            int gcd = gcd(ring, ring2);
            sb.append(ring / gcd);
            sb.append("/");
            sb.append(ring2/ gcd);
            sb.append("\n");
        }
        
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static int gcd(int a, int b) {
        int $a = a;
        int $b = b;
        while ($b != 0) {
            int mod = $a % $b;
            $a = $b;
            $b = mod;
        }
        return $a;
    }
}