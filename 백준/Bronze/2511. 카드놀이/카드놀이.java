import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int aResult = 0;
        int bResult = 0;
        String winner = "D";
        for (int i = 0; i < 10; ++i) {
        	a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; ++i) {
        	b[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; ++i) {
        	if (a[i] < b[i]) {
        		bResult += 3;
        		winner = "B";
        	} else if (a[i] > b[i]) {
        		aResult += 3;
        		winner = "A";
        	} else {
        		aResult += 1;
        		bResult += 1;
        	}
        }
        if (aResult < bResult) {
        	winner = "B";
        } else if (aResult > bResult) {
        	winner = "A";
        }
    	System.out.println(aResult + " " + bResult);
    	System.out.println(winner);
    	
    }
}