import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String param1 = br.readLine();
        String[] arr1 = param1.split(" ");
        
        String param2 = br.readLine();
        String[] arr2 = param2.split(" ");
        
        int todayTemp = Integer.parseInt(arr1[0]);
        int todayWind = Integer.parseInt(arr1[1]);
        
        int tomorrowTemp = Integer.parseInt(arr2[0]);
        int tomorrowWind = Integer.parseInt(arr2[1]);
        
        if (tomorrowTemp < 0 && tomorrowWind >= 10) {
            sb.append("A storm warning for tomorrow! Be careful and stay home if possible!");
        } else if (tomorrowTemp < todayTemp) {
            sb.append("MCHS warns! Low temperature is expected tomorrow.");
        } else if (tomorrowWind > todayWind) {
            sb.append("MCHS warns! Strong wind is expected tomorrow.");
        } else {
            sb.append("No message");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}