import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int from = s.nextInt();
		int to = s.nextInt();
		boolean[] result = new boolean[to + 1];
		if (to < 2) {
			return;
		}
		if (to == 2) {
			System.out.println(2);
			return;
		}
		if (from < 2) {
			from = 2;
		}
		if (from == 2) {
			result[2] = true;
		}
		
		for (int j = from; j <= to; ++j) {
			boolean result1 = true;
			for (int i = (int)Math.sqrt(j); i > 1; --i) {
				if (j % i == 0) {
					result1 = false;
					break;
				}
			}
			result[j] = result1;
		}
		
		for (int i = 1; i < result.length; ++i) {
			if (result[i]) {
				System.out.println(i);
			}
		}
	}
}