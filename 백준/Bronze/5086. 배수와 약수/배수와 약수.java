import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        String param = "";
        while (!(param = br.readLine()).equals("0 0")) {
            String[] arr = param.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if (a % b == 0) {
                result += "multiple";
            } else if (b % a == 0) {
                result += "factor";
            } else {
                result += "neither";
            }
            result += "\n";
        }
        System.out.print(result);
    }
}