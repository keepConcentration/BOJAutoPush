import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 101;
        for (int i = 1; i <= 7; ++i) {
        	int nextInt = sc.nextInt();
        	
    		if (nextInt % 2 == 1) {
    			sum += nextInt;
    			if (min > nextInt) {
    				min = nextInt;
    			}
    		}
        }
        if (sum == 0 && min == 101) {
        	System.out.println(-1);
        } else {
        	System.out.println(sum);
            System.out.println(min);
        }
        
    }
}