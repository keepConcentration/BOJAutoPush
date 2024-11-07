import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long a = Long.parseLong(br.readLine());
        
        double sqrt = Math.sqrt(a);
        
        System.out.println(sqrt * 4);
        
    }
}