import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] dfArr = br.readLine().split(" ");
        int a = Integer.parseInt(dfArr[0]);
        int b = Integer.parseInt(dfArr[1]);
        int c = Integer.parseInt(dfArr[2]);
        
        int loop = Integer.parseInt(br.readLine());
        
        int result = 0;
        
        for (int i = 0; i < loop; ++i) {
            int subRes = 0;
            for (int j = 0; j < 3; ++j) {
                String[] arr = br.readLine().split(" ");
                subRes += Integer.parseInt(arr[0]) * a;
                subRes += Integer.parseInt(arr[1]) * b;
                subRes += Integer.parseInt(arr[2]) * c;
            }
            if (result < subRes) {
                result = subRes;
            }
        }
        
        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}