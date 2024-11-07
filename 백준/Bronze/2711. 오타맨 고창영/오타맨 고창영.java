import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            String[] params = br.readLine().split(" ");
            int idx = Integer.parseInt(params[0]) - 1;
            String targetStr = params[1];
            
            
            if (idx == 0) {
                result += targetStr.substring(1, targetStr.length());
            } else if (idx == targetStr.length() - 1) {
                result += targetStr.substring(0, idx);
            } else {
                result += targetStr.substring(0, idx) + targetStr.substring(idx + 1, targetStr.length());
            }
            result += "\n";
        }
        System.out.println(result);
    }
}