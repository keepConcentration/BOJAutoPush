import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Double.parseDouble(param[0]) / Double.parseDouble(param[1])));
        bw.flush();
        bw.close();
    }
}