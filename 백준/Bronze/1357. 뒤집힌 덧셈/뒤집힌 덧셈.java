import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String[] params = param.split(" ");
        System.out.println(reverse(reverse(params[0]) + reverse(params[1])));
    }
    
    public static int reverse(int a) {
        String str = String.valueOf(a);
        String resStr = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            resStr += str.substring(i, i + 1);
        }
        return Integer.parseInt(resStr);
    }
    
    public static int reverse(String a) {
        return reverse(Integer.parseInt(a));
    }
}