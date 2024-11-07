import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int input = Integer.parseInt(br.readLine());
        String input2 = br.readLine();
        for (int i = input; i > 0; --i) {
            result += Integer.parseInt(input2.substring(i - 1, i));
        }
        System.out.println(result);
    }
}