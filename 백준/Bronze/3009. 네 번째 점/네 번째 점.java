import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        String[] param = br.readLine().split(" ");
        int x1 = Integer.parseInt(param[0]);
        int y1 = Integer.parseInt(param[1]);
        
        param = br.readLine().split(" ");
        int x2 = Integer.parseInt(param[0]);
        int y2 = Integer.parseInt(param[1]);
        
        param = br.readLine().split(" ");
        int x3 = Integer.parseInt(param[0]);
        int y3 = Integer.parseInt(param[1]);
        
        int resultX = 0;
        int resultY = 0;
        
        if (x1 == x2) {
            resultX = x3;
        } else if (x2 == x3) {
            resultX = x1;
        } else {
            resultX = x2;
        }
        
        if (y1 == y2) {
            resultY = y3;
        } else if (y2 == y3) {
            resultY = y1;
        } else {
            resultY = y2;
        }
        result.append(resultX);
        result.append(" ");
        result.append(resultY);
        
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}