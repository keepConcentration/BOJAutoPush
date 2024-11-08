import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()) * 3;
			A += Integer.parseInt(br.readLine()) * 2;
			A += Integer.parseInt(br.readLine());
		
		int B = Integer.parseInt(br.readLine()) * 3;
			B += Integer.parseInt(br.readLine()) * 2;
			B += Integer.parseInt(br.readLine());
		
		if (A < B) {
			System.out.println("B");
		} else if (B < A) {
			System.out.println("A");
		} else {
			System.out.println("T");
		}
	}
		
}