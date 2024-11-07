import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int param = sc.nextInt();
        for (int i = 0; i < param; ++i) {
            for (int j = 0; j < param; ++j) {
            	if (i > j) {
            		System.out.print(" ");
            	} else {
            		System.out.print("*");
            	}
            }
            System.out.println();
        }
    }
}