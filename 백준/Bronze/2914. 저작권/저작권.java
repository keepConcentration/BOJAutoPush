import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int cnt = Integer.parseInt(params[0]);
        int avg = Integer.parseInt(params[1]);
        int mp = cnt * (avg - 1) + 1;
        System.out.print(mp);
    }
}