import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        double a1 = Double.parseDouble(params[0]);
        double p1 = Double.parseDouble(params[1]);
        
        params = br.readLine().split(" ");
        double r1 = Double.parseDouble(params[0]);
        
        double a2 = Math.PI * Math.pow(r1, 2);
        double p2 = Double.parseDouble(params[1]);
        
        System.out.println((a1 / p1) < (a2 / p2) ? "Whole pizza" : "Slice of pizza");
        
    }
}