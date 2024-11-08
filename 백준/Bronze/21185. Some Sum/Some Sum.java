import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		String result = "Either";
		if (a % 4 == 0) {
			result = "Even";
		} else if (a % 2 == 0) {
			result = "Odd";
		}
		
		System.out.println(result);
		
	}
		
}