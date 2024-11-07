import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int loop = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= loop; ++i) {
            sb.append(i);
        }
        String toStr = sb.toString();
        System.out.println(toStr.indexOf(line) + 1);
    }
}