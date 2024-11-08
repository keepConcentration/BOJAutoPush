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
        
        int T = parseInt(br.readLine());
        
        l:while (T-- > 0) {
            String[] in = br.readLine().split(" ");
            int N = parseInt(in[0]);
            int X = parseInt(in[1]);
            int Y = parseInt(in[2]);
            
            
            String[] in2 = br.readLine().split(" ");
            int maxSpeed = Integer.MIN_VALUE;
            int mySpeed = parseInt(in2[N - 1]);
            
            for (int i = 0; i < N - 1; ++i) {
                int speed = parseInt(in2[i]);
                if (maxSpeed < speed) {
                    maxSpeed = speed;
                }
            }
            if (maxSpeed < mySpeed) {
                sb.append("0\n");
                continue l;
            }
            
            double maxTime = 1.0 * X / maxSpeed;
            if (maxTime <= 1 + 1.0 * (X - Y) / mySpeed) {
                sb.append("-1\n");
                continue;
            }
            
            int left = 0;
            int right = Y;
            while (left <= right) {
                int mid = (left + right) / 2;
                double myTime = 1.0 * (X - mid) / mySpeed + 1;
                if (maxTime <= myTime) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            sb.append(left).append("\n");
        }
         
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}