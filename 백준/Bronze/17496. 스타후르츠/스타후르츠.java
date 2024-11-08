import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int summer = Integer.parseInt(params[0]);
        int day = Integer.parseInt(params[1]);
        int yard = Integer.parseInt(params[2]);
        int amt = Integer.parseInt(params[3]);
        
        System.out.println(amt * yard * (int)((summer - 1) / day));
    }
}