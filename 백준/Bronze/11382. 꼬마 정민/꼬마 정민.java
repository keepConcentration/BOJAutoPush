import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        long a = Long.parseLong(params[0]);
        long b = Long.parseLong(params[1]);
        long c = Long.parseLong(params[2]);
        
        System.out.println(a + b + c);
    }
}
