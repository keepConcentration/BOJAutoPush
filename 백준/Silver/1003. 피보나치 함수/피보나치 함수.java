import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static Integer[][] result = new Integer[41][2];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        
        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;
        
        
        for (int i = 0; i < loop; ++i) {
            int param = Integer.parseInt(br.readLine());
            fibonacci(param);
            sb.append(result[param][0]);
            sb.append(" ");
            sb.append(result[param][1]);
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static Integer[] fibonacci(int n) {
        if (result[n][0] == null || result[n][1] == null) {
            result[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            result[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return result[n];                                                                           
    }
}