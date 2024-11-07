import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String space = " ";
        String[] params = br.readLine().split(space);
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int d = Integer.parseInt(params[3]);
        int e = Integer.parseInt(params[4]);
        int f = Integer.parseInt(params[5]);
        
        System.out.print(1 - a + " ");
        System.out.print(1 - b + " ");
        System.out.print(2 - c + " ");
        System.out.print(2 - d + " ");
        System.out.print(2 - e + " ");
        System.out.print(8 - f + " ");
        
    }
}