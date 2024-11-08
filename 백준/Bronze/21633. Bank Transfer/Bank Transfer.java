import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        
        double result = 25 + target * 0.01;
        result = Math.max(result, 100.00);
        result = Math.min(result, 2000.00);
        
        System.out.printf("%.2f", result);
    }
}