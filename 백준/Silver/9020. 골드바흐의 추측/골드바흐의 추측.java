import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String result = "";
        for (int z = 0; z < loop; ++z) {
            int target = Integer.parseInt(br.readLine());
            boolean[] primeArr = new boolean[target + 1];
            int result1 = Integer.MAX_VALUE;
            int result2 = 0;
            for (int i = 2; i < primeArr.length; ++i) {
                primeArr[i] = true;
            }
            for (int i = 2; i < Math.sqrt(target); ++i) {
                if (primeArr[i]) {
                    for (int j = i * i; j <= target; j += i) {
                        primeArr[j] = false;
                    }
                }
            }
            
            int i = target / 2;
            int j = target % 2 == 1 ? target / 2 + 1 : target / 2;
            
            for (; i > 1; --i, ++j) {
                if (primeArr[i] && primeArr[j]) {
                    if (target == (i + j)) {
                        if (Math.abs(result1 - result2) > Math.abs(i - j)) {
                            result1 = i;
                            result2 = j;
                        }
                    }
                }
            }
            result += result1 + " " + result2 + "\n";
        }
        System.out.print(result);
    }
}