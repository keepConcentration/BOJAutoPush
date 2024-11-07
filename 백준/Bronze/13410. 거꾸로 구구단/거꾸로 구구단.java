import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int result = 0;
        StringBuilder reverse = null;
        
        for (int i = 1; i <= b; ++i) {
            reverse = new StringBuilder(String.valueOf(a * i));
            reverse = reverse.reverse();
            int c = Integer.parseInt(reverse.toString());
            if (result < c) {
                result = c;
            }
        }
        System.out.println(result);
    }
}