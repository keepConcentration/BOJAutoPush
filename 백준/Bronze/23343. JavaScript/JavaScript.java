import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String param = br.readLine();
        String[] arr = param.split(" ");
        
        try {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int subtract = a - b;
            
            sb.append(String.valueOf(subtract));
            
        } catch (NumberFormatException e) {
            sb.append("NaN");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}