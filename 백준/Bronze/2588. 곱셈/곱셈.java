import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        for (int i = b.length(); i > 0; --i) {
            int c = a * Integer.parseInt(b.substring(i - 1, i));
            bw.write(c + "\n");
        }
        bw.write(String.valueOf(a * Integer.parseInt(b)));
        bw.flush();
        bw.close();
    }
}