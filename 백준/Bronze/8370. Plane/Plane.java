import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int d = Integer.parseInt(params[3]);
        
        System.out.print(a * b + c * d);
    }
}