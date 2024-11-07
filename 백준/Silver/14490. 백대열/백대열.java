import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String[] params = param.split(":");
        
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        
        int tempA = a;
        int tempB = b;
        int r = 0;
        while (tempB != 0) {
            r = tempA % tempB;
            tempA = tempB;
            tempB = r;
        }
        
        System.out.println(a/tempA + ":" + b/tempA);
        
    }
}