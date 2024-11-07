import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = "";
        String result = "";
        while (!(param = br.readLine()).equals("0 0 0")) {
            String[] params = param.split(" ");
            int a = Integer.parseInt(params[0]);
            int b = Integer.parseInt(params[1]);
            int c = Integer.parseInt(params[2]);
            if (c - b == b - a) {
                result += "AP " + (c + c - b) + "\n";
            } else {
                result += "GP " + (c * (int)(b / a)) + "\n";
            }
        }
        System.out.print(result);
    }
}