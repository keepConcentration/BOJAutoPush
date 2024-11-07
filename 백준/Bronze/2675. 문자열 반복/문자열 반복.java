import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < loop; ++i) {
            String readLine = br.readLine();
            for (int j = 2; j < readLine.length(); ++j) {
                for (int k = 0; k < Integer.parseInt(readLine.substring(0, 1)); ++k) {
                    result += readLine.substring(j, j + 1);
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }
}