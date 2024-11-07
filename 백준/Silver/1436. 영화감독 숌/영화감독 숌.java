import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int target = Integer.parseInt(br.readLine());
        int cnt = 1;
        int result = 666;
        while (cnt != target) {
            result++;
            if (String.valueOf(result).indexOf("666") != -1) {
                cnt++;
            }
        }
        
        sb.append(String.valueOf(result));
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}