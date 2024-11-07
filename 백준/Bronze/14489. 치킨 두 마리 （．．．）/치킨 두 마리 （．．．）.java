import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        int c = Integer.parseInt(br.readLine()) * 2;
        
        if ((a + b) < c) {
            System.out.println(a + b);
        } else {
            System.out.println(a + b - c);
        }
    }
}