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
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int compute = 0;
        for (int i = 0; i < N; ++i) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            compute += a * b;
            if (compute > X) {
                break;
            }
        }
        
        if (X == compute) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}