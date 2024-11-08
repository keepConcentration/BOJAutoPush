import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] params = br.readLine().split(" ");
		
		int a = Integer.parseInt(params[0]);
		int b = Integer.parseInt(params[1]);
		int c = Integer.parseInt(params[2]);
		int coin = 0;
		int result = 0;
		
		for (int i = 1; i <= Integer.MAX_VALUE; ++i) {
			coin += a;
			if (i % 7 == 0) {
				coin += b;
			}
			result++;
			if (coin >= c) {
				break;
			}
		}
		
		System.out.println(result);
		
	}
}