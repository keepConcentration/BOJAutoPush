import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String space = " ";
        String[] params = br.readLine().split(space);
        int m = Integer.parseInt(params[0]);
        int p = Integer.parseInt(params[1]);
        
        int mp = m * p;
        
        params = br.readLine().split(space);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5; ++i) {
            int news = Integer.parseInt(params[i]);
            if (i != 4) {
                sb.append((news - mp) + space);
            } else {
                sb.append((news - mp));
            }
        }
        System.out.print(sb.toString());
    }
}