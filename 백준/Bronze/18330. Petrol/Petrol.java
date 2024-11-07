import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = B + 60 - A;
        
		int result = C >= 0 ? A * 1500 : ((B + 60) * 1500 + (A - B - 60) * 3000);
		
		System.out.println(result);
	}
		
}