import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] params = br.readLine().split(" ");
		
		int h = Integer.parseInt(params[0]);
		int w = Integer.parseInt(params[1]);
		
		double hw = h + w;
		
		double c = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));
		
		System.out.println(hw - c);
		
	}
		
}