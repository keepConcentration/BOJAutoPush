import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        String result = "";
		int input = Integer.parseInt(new Scanner(System.in).nextLine());
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				result += "*";
			}
			if (i != input) {
				result += "\n";
			}
		}
		System.out.println(result);
    }
}