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
        
        int A = parseInt(in[0]);
        int B = parseInt(in[1]);
        int C = parseInt(in[2]);
        
        if (C % 2 == 0) {
            sb.append(A);
        } else {
            sb.append(A ^ B);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}