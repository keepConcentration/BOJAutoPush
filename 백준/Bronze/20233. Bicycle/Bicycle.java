import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        
        int aPay = T <= 30 ? A : (T - 30) * X * 21 + A;
        int bPay = T <= 45 ? B : (T - 45) * Y * 21 + B;
        
        
        System.out.println(aPay);
        System.out.println(bPay);
        
    }
}