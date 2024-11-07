import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int loop = Integer.parseInt(params[0]);
        int w = Integer.parseInt(params[1]);
        int h = Integer.parseInt(params[2]);
        int max = (int)(Math.sqrt((Math.pow(w, 2) + Math.pow(h, 2))));
        String result = "";
        for (int i = 0; i < loop; ++i) {
            int target = Integer.parseInt(br.readLine());
            if (target <= max) {
                result += "DA\n";
            } else {
                result += "NE\n";
            }
        }
        System.out.print(result);
    }
}