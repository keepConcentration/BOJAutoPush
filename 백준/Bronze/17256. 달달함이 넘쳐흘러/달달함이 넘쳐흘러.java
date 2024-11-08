import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] params = br.readLine().split(" ");
        int ax = Integer.parseInt(params[0]);
        int ay = Integer.parseInt(params[1]);
        int az = Integer.parseInt(params[2]);
        
        params = br.readLine().split(" ");
        int cx = Integer.parseInt(params[0]);
        int cy = Integer.parseInt(params[1]);
        int cz = Integer.parseInt(params[2]);
        
        bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax) + "\n");
        bw.flush();
    }
}