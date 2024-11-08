import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] params = br.readLine().split(" ");
		
		int wn = Integer.parseInt(params[0]);
		int hn = Integer.parseInt(params[1]);
		
		int ws = Integer.parseInt(params[2]);
		int hs = Integer.parseInt(params[3]);
		
		if (wn - ws >= 2 && hn - hs >= 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
		
}