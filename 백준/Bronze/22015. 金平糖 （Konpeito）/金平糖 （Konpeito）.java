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
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        int max = Math.max(Math.max(a, b), c);
        int result = max - a + max - b + max - c;
        
        sb.append(String.valueOf(result));
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}