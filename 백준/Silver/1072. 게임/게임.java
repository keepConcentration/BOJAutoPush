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
        
        String[] in = br.readLine().split(" ");
        
        int X = parseInt(in[0]);
        int Y = parseInt(in[1]);
        double Z = 100.0 * Y / X;
        
        if ((int)Z == 99 || (int)Z == 100) {
            sb.append("-1\n");
        } else {
            int left = 0;
            int right = X;
            int mid = 0;
            while (left < right) {
                mid = (left + right) / 2;
                int $X = X + mid;
                int $Y = Y + mid;
                double $Z = 100.0 * $Y / $X;
                
                if ((int)$Z > (int)Z) {
                    right = mid;
                } else {
                    left = mid + 1;
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