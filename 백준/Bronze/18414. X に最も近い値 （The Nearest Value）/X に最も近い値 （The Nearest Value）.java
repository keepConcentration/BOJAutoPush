import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        
        int X = Integer.parseInt(params[0]);
        int L = Integer.parseInt(params[1]);	// O
        int R = Integer.parseInt(params[2]);	// O
        
        int result = 0;
        
        if (X <= L) {
        	result = L;
        } else if (R <= X) {
        	result = R;
        } else {
        	result = X;
        }
        System.out.println(result);
        
    }
}