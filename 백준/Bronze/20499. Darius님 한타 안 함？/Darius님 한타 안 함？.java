import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] params = br.readLine().split("/");
        int K = Integer.parseInt(params[0]);
        int D = Integer.parseInt(params[1]);
        int A = Integer.parseInt(params[2]);
        String result = "gosu";
        if (K + A < D || D == 0) {
            result = "hasu";
        }
        System.out.println(result);
    }
}