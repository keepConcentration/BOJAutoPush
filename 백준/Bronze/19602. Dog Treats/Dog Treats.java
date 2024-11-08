import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine()) * 2;
        int c = Integer.parseInt(br.readLine()) * 3;
        int d = a + b + c;
        System.out.println(d < 10 ? "sad" : "happy");
    }
}