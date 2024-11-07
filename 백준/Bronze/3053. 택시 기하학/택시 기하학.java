import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        double r = Double.parseDouble(param);
        br.close();
        System.out.printf("%.6f", r * r * Math.PI);
        System.out.println();
        System.out.printf("%.6f", r * r * 2);
    }
}