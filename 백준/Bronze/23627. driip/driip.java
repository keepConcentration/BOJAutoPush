import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String driip = "driip";
        String str = br.readLine();
        
        br.close();
        if (str.lastIndexOf(driip) == str.length() - 5 && str.length() > 4) {
            bw.write("cute\n");
        } else {
            bw.write("not cute\n");
        }
        bw.flush();
        bw.close();
    }
}