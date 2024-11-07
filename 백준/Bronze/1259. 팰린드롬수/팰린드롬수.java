import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String input = "";
        
        while (!(input = br.readLine()).equals("0")) {
            if (new StringBuffer(input).reverse().toString().equals(input)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}