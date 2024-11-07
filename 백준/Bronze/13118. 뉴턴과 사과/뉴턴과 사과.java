import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String[] params = param.split(" ");
        int p1 = Integer.parseInt(params[0]);
        int p2 = Integer.parseInt(params[1]);
        int p3 = Integer.parseInt(params[2]);
        int p4 = Integer.parseInt(params[3]);
        
        String param2 = br.readLine();
        String[] params2 = param2.split(" ");
        int x = Integer.parseInt(params2[0]);
        if (x == p1) {
            System.out.println("1");
        } else if (x == p2) {
            System.out.println("2");
        } else if (x == p3) {
            System.out.println("3");
        } else if (x == p4) {
            System.out.println("4");
        } else {
            System.out.println("0");
        }
    }
}