import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int k = 0; k < loop; ++k) {
            String param = br.readLine();
            String[] params = param.split(" ");
            int maxDivisor = 0;
            for (int i = 0; i < params.length - 1; ++i) {
                for(int j = i + 1; j < params.length; ++j) {
                    int r = 0;
                    int a = Integer.parseInt(params[i]);
                    int b = Integer.parseInt(params[j]);
                    if (a < b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    while (b != 0) {
                        r = a % b;
                        a = b;
                        b = r;
                    }
                    if (maxDivisor < a) {
                        maxDivisor = a;
                    }
                }
            }
            result += (maxDivisor + "\n");
        }
        System.out.print(result);
    }
}