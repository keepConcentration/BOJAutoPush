import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sLoop = br.readLine();
        String[] loopSplit = sLoop.split(" ");
        int sampleLoop = Integer.parseInt(loopSplit[0]);
        int systemLoop = Integer.parseInt(loopSplit[1]);
        boolean sampleOk = true;
        boolean systemOk = true;
        for (int i = 0; i < sampleLoop; ++i) {
            String[] param = br.readLine().split(" ");
            if (!param[0].equals(param[1])) {
                sampleOk = false;
            }
        }
        for (int i = 0; i < systemLoop; ++i) {
            String[] param = br.readLine().split(" ");
            if (!param[0].equals(param[1])) {
                systemOk = false;
            }
        }
        String result = "";
        if (systemOk && sampleOk) {
            result = "Accepted";
        } else if (sampleOk && !systemOk) {
            result = "Why Wrong!!!";
        } else {
            result = "Wrong Answer";
        }
        System.out.println(result);
    }
}