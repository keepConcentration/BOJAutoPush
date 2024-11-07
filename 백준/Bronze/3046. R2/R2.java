import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String space = " ";
        String[] params = br.readLine().split(space);
        int r1 = Integer.parseInt(params[0]);
        int s = Integer.parseInt(params[1]);
        System.out.print(2 * s - r1);
    }
}