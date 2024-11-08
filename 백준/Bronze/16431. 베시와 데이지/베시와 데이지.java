import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bessie = br.readLine().split(" ");
        String[] daisy = br.readLine().split(" ");
        String[] john = br.readLine().split(" ");
        
        int bessieX = Integer.parseInt(bessie[0]);
        int bessieY = Integer.parseInt(bessie[1]);
        int daisyX = Integer.parseInt(daisy[0]);
        int daisyY = Integer.parseInt(daisy[1]);
        int johnX = Integer.parseInt(john[0]);
        int johnY = Integer.parseInt(john[1]);
        
        int bessieRes = (int)(Math.abs(bessieX - johnX)) < (int)(Math.abs(bessieY - johnY)) ? (int)(Math.abs(bessieY - johnY)) : (int)(Math.abs(bessieX - johnX));
        
        int daisyRes = (int)(Math.abs(daisyX - johnX)) + (int)(Math.abs(daisyY - johnY));
        
        if (bessieRes == daisyRes) {
            System.out.println("tie");
        } else if (bessieRes > daisyRes) {
            System.out.println("daisy");
        } else {
            System.out.println("bessie");
        }
        
        
        
    }
}