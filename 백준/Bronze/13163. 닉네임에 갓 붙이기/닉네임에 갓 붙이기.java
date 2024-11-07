import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            result += "god";
            for (int j = 1; j < param.length; ++j) {
                result += param[j];
            }
            result += "\n";
        }
        System.out.print(result);
    }
}