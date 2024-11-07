import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        int m = Integer.parseInt(params[1]);
        int k = Integer.parseInt(params[2]);
        
        System.out.print(k / m + " " + k % m);
    }
}