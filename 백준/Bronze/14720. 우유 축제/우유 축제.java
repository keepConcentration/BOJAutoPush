import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int result = 0;
        int currentMilk = 2;
        String[] strMilks = br.readLine().split(" ");
        int[] milks = new int[loop];
        for (int i = 0; i < loop; ++i) {
            milks[i] = Integer.parseInt(strMilks[i]);
        }
        for (int i = 0; i < loop; ++i) {
            if (milks[i] == 0 && currentMilk == 2) {
                currentMilk = 0;
                result++;
            } else if (milks[i] == 1 && currentMilk == 0) {
                currentMilk = 1;
                result++;
            } else if (milks[i] == 2 && currentMilk == 1) {
                currentMilk = 2;
                result++;
            }
        }
        System.out.println(result);
    }
}