import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println(new Main().compute(x, y));
	}
	
	int compute(int x, int y) {
		if (x < 0) {
			if (y < 0) {
				return 3;
			} else {
				return 2;
			}
		} else {
			if (y < 0) {
				return 4;
			} else {
				return 1;
			}
		}
	}
}