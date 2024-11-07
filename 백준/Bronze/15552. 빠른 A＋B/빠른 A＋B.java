import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            bw.write(Integer.parseInt(param[0]) + Integer.parseInt(param[1]) + "\n");
        }
        bw.flush();
    }
}