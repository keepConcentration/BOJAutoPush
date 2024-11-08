import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        
        int temp = a;
        
        if (a < b) {
        	temp = a;
        	a = b;
        	b = temp;
        }
        if (b < c) {
        	temp = b;
        	b = c;
        	c = temp;
        }
        if (a < b) {
        	temp = a;
        	a = b;
        	b = temp;
        }
        System.out.println(a + b);
    }
}