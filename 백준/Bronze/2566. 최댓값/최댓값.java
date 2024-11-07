import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int w = 1;
        int h = 1;
        for (int i = 1; i <= 9; ++i) {
        	for (int j = 1; j <= 9; ++j) {
        		int nextInt = sc.nextInt();
        		if (nextInt > result) {
        			result = nextInt;
        			w = i;
        			h = j;
        		}
        	}
        }
        System.out.println(result);
        System.out.print(w + " " + h);
    }
}