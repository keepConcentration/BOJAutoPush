import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static int[] arr;
    static int n;
    static int m;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        String[] param = br.readLine().split(" ");
        br.close();
        n = Integer.parseInt(param[0]);
        m = Integer.parseInt(param[1]);
        
        arr = new int[m];
        
        dfs(0);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static void dfs(int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(String.valueOf(val));
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < n; ++i) {
            arr[depth] = i + 1;
            dfs(depth + 1);
        }
    }
}