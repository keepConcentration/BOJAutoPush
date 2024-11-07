import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
		for (int i = 0; i < loop; i++) {
			int param = -(sc.nextInt()) + sc.nextInt(),
			    incr = 0,
			    result = 1;
			while (param > 0) {
				param -= ++result % 2 == 0 ? ++incr : incr;
			}
			System.out.println(result - 1);
		}
    }
}